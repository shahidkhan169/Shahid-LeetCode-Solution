class Solution {
    public String firstPalindrome(String[] words) {
        int len=words.length;
        for(int i=0;i<len;i++)
        {
            String word=words[i];
            int n=word.length();
            String rev="";
            for(int j=0;j<n;j++)
            {
                char ch=word.charAt(j);
                rev=ch+rev;
            }
            if(word.equals(rev))
            {
                return word;
            }
        }
        return "";
    }
}
