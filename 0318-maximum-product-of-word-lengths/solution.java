class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int[] bit=new int[n];
        for(int i=0;i<n;i++)
        {
            for(char c:words[i].toCharArray())
                bit[i]|=(1<<(c-'a'));
        }
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((bit[i]&bit[j])==0)
                    ans=Math.max(ans,words[i].length()*words[j].length());
            }
        }
        return ans;
    }
}
