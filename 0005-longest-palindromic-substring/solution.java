class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        if(s.length()==1)
        {
            return s;
        }
        String str = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j >=i; j--) {
                if(s.charAt(i)==s.charAt(j))
                {
                    str=s.substring(i,j+1);
                    String rev=new StringBuilder(str).reverse().toString();
                    if(str.equals(rev) && str.length() > ans.length())
                    {
                        ans=str;
                    }
                }
                    
                    
            }
        }
        return ans;
    }
}
