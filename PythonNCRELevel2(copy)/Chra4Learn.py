#Choose: axb b?xa d c d cxa c a dxc d

#T1

'''
num = input()
num = int(num)
num_chu4 = num/4 #除4
num_chu100 = num/100 #除100
num_chu400 = num/400
if num_chu4 == int(num_chu4): #整数等于浮点
    if num_chu100 != int(num_chu100):
        print("是闰年")
    else:
        print("NO")
elif num_chu400 == int(num_chu400):
    print("Yes runnian")
else:
    print("NO")
'''

#T2
'''
#辗转相除法求最大公约数
def gcd(a, b):
    while a != 0:
        a, b = b % a, a
 
    return b
#最小公倍数
def gbs(a,b,c):
    a = (a * b)/c
    return a
    
num1 = int(input())
num2 = int(input())
gcd = gcd(num1,num2)
gbs = gbs(num1,num2,gcd)
print(str(gcd) + "\n" + str(gbs))
'''

#T3
'''
try:
    num = input()
    
except:
'''
#T4
import os
num = input()
while num != int:
    print("No int!")
    num = input()
    #or exit
    #os.exit()

#T5 羊车门问题





