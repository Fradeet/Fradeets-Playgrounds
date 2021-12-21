#Run in this folder
#test local xml files

import bs4 # not import beaut...
#在里面有特殊字符,所以需要用二进制编码打开,后转码utf8(BS自动转换)
source = open("BingHPImageArchiveTest.xml","rb")
codeword = source.read()
xmlword = bs4.BeautifulSoup(codeword,"html.parser")
xmlword = xmlword.images.url #识别<images><url>
word = xmlword.get_text()
print(word)
#>>> e.g. /th?id=OHR.SiberianSunset_ZH-CN5711093662_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp
#Fin

