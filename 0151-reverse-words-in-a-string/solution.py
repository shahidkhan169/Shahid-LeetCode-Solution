class Solution(object):
    def reverseWords(self, s):
        li=[]
        lis=[]
        for i in s.split():
            li.append(i)
        lis=li[::-1]
        return(' '.join(map(str, lis)))







        
        
        
