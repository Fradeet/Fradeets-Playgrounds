# Server:OpenStreetMap-Docker:2.0.0

print("Hallo Earth!")
from time import sleep
from PIL import Image
import os
import requests

#初始化全局变量 Initialize global variables
xList= yList= []
tryCount= 0

def CalcAreaLong():
    areaList= []
    global xList, yList
    
    xLong= xList[1]- xList[0]+ 1 #相减得区域长度 Area length
    yLong= yList[1]- yList[0]+ 1 #两个都包括了结束点的图片贴 Both include the tile of the last one 
    
    areaTilesLong= (xLong-1,yLong-1)#每行每列图贴数,因为计数从1开始，去掉先前加的1
    areaPixelLong= (xLong*256,yLong*256)#一大张图贴长度 A big combined tile width and length 
    areaList.append(areaPixelLong)
    areaList.append(areaTilesLong)
    return(areaList)
    
def GetNetworkPictures(infoDict):
    tilesUrl= "http://localhost:8080/tile/{z}/{x}/{y}.png" #服务器网站，留下{x}等 target tiles server address
    tilesUrl= tilesUrl.format(**infoDict)
    tilePic = requests.get(tilesUrl)
    return tilePic



def main():
    global xList,yList,tilesUrl
    
    #输入放大倍率 Zoom
    zoomRate= input("输入放大级数 (Zoom)：")

    #输入矩形区域 Enter rectangular area
    p1X, p1Y= map(int,input("输入矩形区域的第一个对角线点Location1 (x,y)：").split(","))
    p2X, p2Y= map(int,input("输入矩形区域的另一个对角线点Location2 (x,y)：").split(","))

    #同级排序,避免负数，规范顺序（同意从数字小的那一端，左上角开始）
    xList= [p1X,p2X]
    xList.sort()
    yList= [p1Y,p2Y]
    yList.sort()

    #写回备用
    p1X, p2X= map(int,xList)
    p1Y, p2Y= map(int,yList)

    areaList= CalcAreaLong() #子程序：计算行列区块多少与像素长度，返回列表
    areaPixelLong= areaList[0]
    areaTilesLong= areaList[1]

    #TODO:图片分割
    
    targetPic = Image.new('RGBA',areaPixelLong) #新建（区块大小）空白图片 New blank picture to store tiles, size is same as all tiles combined.
    locateDict= dict()

    #双for循环/子程序 粘贴图片
    picX= picY= 0
    for nowX in range(p1X,p2X+1):
        picY= 0
        print("Processing({}, {}), Total{}".format(picX,picY,areaTilesLong)) #减少通知次数
        for nowY in range(p1Y,p2Y+1):
            tryCount= 0
            while True and tryCount < 10: #有时候读取图片会遭到拒绝，重试多次(在本机大概是18次左右)是因为同步盘的原因会锁存文件
                try:
                    tryCount+= 1
                    locateDict= {"z":zoomRate,"x":nowX,"y":nowY} #将单图片详细信息写入字典
                    currentNetworkFile= GetNetworkPictures(locateDict) #子程序：从网络服务器获取图片
                    
                    currentFile= open(".\\~temp\\~temp.png","wb") #不知道如何在变量传入图片变量，先写入文件吧#Windows
                    for chunk in currentNetworkFile.iter_content(100000): #分多次写入（防内存溢出?）
                        currentFile.write(chunk)
                    currentFile.close()
                  
                    #TODO:在变量传入图片而不用写入文件

                    currentPic= Image.open(".\\~temp\\~temp.png")
                    currentCopyPic= currentPic.copy()#可不可以不用copy()，直接paste()？
                    currentPic.close()
                    picLocation= (picX*256,picY*256) #暂时定义图片大小，后续改成动态
                    targetPic.paste(currentCopyPic,picLocation)
                    picY+= 1
                except:
                    print("Error y= {}, retry {}.".format(picY,tryCount))
                    continue
                break
        picX+= 1
    targetPic.save(".\\~temp\\test-Z"+ str(zoomRate)+ "-Size"+ str(areaTilesLong)+ "-L("+ str(p1X)+ ","+ str(p1Y)+ ")to("+ str(p2X)+ ","+ str(p2Y)+ ").png")
    print("Finish.")

if __name__== "__main__":
    main()