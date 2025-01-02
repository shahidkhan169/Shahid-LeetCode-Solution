class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c=0;
        String str="";
        while(str.length()<(a.length()+b.length()))
        {
            str+=a;
            c++;
            if(str.contains(b))
                return c;
        }
        return -1;
    }
}
