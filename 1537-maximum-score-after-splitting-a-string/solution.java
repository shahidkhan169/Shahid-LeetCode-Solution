class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                prefix[i+1]=prefix[i]+1;
            else    
                prefix[i+1]=prefix[i];
        }
        int totalOnes=prefix[n];
        int ans=0;
        for(int i=1;i<n;i++)
        {
            int leftZeros=i-prefix[i];
            int rightOnes=totalOnes-prefix[i];
            int score=leftZeros+rightOnes;
            ans=Math.max(ans,score);
        }
        return ans;
    }
}
