'''
#T1字符串频率
#todo:给定字符串
words= input()
#todo:字符串频率统计,小写
alphabet= [chr(i) for i in range(97,123)]
words= list(words)
##遍历此列表,转换小写并剔除非字母
counts= dict() #初始化空字典
for i in words:
    if i.lower() not in alphabet:
        continue
    #将小写字符统计增加至一个字典里
    lowerI= i.lower()
    num= counts.get(lowerI,0)
    counts.update({lowerI:num+1})
    
#todo:降序排序
#(废弃)提取出所有键的值排序,后放入
#冒泡排序:最大到最小,去一个值后比对,直至比对完毕
alphalist= list(counts.keys())
pxlist= []
while len(alphalist) >0:
    pd= alphalist[0]
    
    #while len(alphalist)== 1:
        #pxlist.append(pd)
        #alphalist.remove(pd)
        #break #循环的末端:最后一个数
        #完全不用这一段,下面到最后列表没了自动跳过
    
    for i in alphalist:
        inum= counts.get(i)
        pdnum= counts.get(pd)
        if pdnum < inum:
            pd= i
        else:
            None
    pxlist.append(pd)
    alphalist.remove(pd)
#逐行输出
for i in pxlist:
    number= counts.get(i)
    print("{}:{}".format(i,number))
'''
'''
#T3随机密码
#初始化结构表
numlist= list(range(10))
dazimulist= [chr(i)for i in range(65,91)]
xiaozimulist= [chr(i)for i in range(97,123)]
zimulist= dazimulist +xiaozimulist
#随机选择字母数字表
import random
ranlist= random.randint(1,2)
passwordlong= 10
long= 0
password= []#密码列表
while long != 10:
    if ranlist == 1: #执行选字母
        num= random.randint(0,52)
        num= zimulist[num]
        password.append(num)
        long += 1
    else:  #执行选数字
        num= random.randint(0,10)
        num = str(num)
        password.append(num)
        long += 1
#组合字符串
password = "".join(password)
print(password)
'''