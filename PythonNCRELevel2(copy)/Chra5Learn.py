#Choose b b b bxd dxc b cxb (c) c axd
#TryC10
'''
def func(ls = []):
    ls.append(1)
    return ls
a= func()
b= func()
print(a,b)
'''

#T1
'''
def isNum(a):
    type_a= type(a)
    if type_a == int or float or complex:
        return True
    else:
        return False
'''

#T2
'''
def isPrime(a):
    type(a) == int #判断质数 
'''
#T3


#T4
'''
def SuShu():
    list1= []
    num = 200
    for i in range(1,num+1):#修改调试
        wrong= 0 #初始化指针
        for j in range(1,i+1):
            a= i/j
            if a==int(a) and i!= j and j!= 1:#可以被其他数整除
                wrong= 1
                break
        if wrong== 0:
             list1.append(str(i))
    strlist= " ".join(list1)
    print(strlist)
SuShu()
'''

#T5
def fbnq(a):
    try: #尝试检测循环变量是否初始化
        type(num)
    except:
        num= 0 #创造一个循环值，记录循环的次数
    num+= 1 #提前加数避免死循环
    while a>= num: #判断是否到达循环次数
        #初始化一个列表装数列
        
        
    #输出最后的数    
fbnq(3)
    
