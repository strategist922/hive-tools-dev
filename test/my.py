# -*- coding: UTF-8 -*-
import sys
reload(sys)
sys.setdefaultencoding('utf-8')

def getList(x):
    return x
    
def echo(x):
    return x
    
def getlen (permission, is_p4p):
     print permission
     print is_p4p
     if is_p4p == '1':
       return permission
     elif is_p4p == '0':
       plist = permission.split('\;')
       for p in plist:
         if p == '商搜和单品二跳':
           plist.remove(p)
       return '\;'.join(plist)
     return "afd"
