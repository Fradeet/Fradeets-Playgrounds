#Two pattern
#The def is in another file



from outsidedef import outsidedef1 as os1
s = input()
os1(s)



import outsidedef as os2
s = input()
os2.outsidedef1(s)


from packagedef.packagedef1 import folderdef1 as fd1 #the def in folder
fd1()
fd1("233","666")