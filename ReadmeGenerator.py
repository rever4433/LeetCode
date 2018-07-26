import os
import os.path
rootdir="E:/gitTest/LeetCode/"
list=[]
result=[]
prefix="https://github.com/rever4433/LeetCode/tree/master/"
space="%20"
for parent,dirnames,filenames in os.walk(rootdir):
    for dirname in dirnames:
        if dirname == ".git":
            continue
        if os.path.isdir(dirname):
            list.append(dirname)
        
        
    
for i in list:
    print("序号:%s,值:%s" %(list.index(i)+1,i))
    linkSuffix=i.replace(" ",space)
    i="### "+str(list.index(i)+1)+".["+i+"]("+prefix+linkSuffix+")"
    result.append(i)

with open('test.md','w') as fw:
    fw.write('%s'%'\n'.join(result))
    
