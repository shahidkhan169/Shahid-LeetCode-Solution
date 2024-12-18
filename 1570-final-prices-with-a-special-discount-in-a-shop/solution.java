class Solution {
    public int[] finalPrices(int[] p) {
        int n=p.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(p[j]<=p[i])
                {
                    ans[i]=p[i]-p[j];
                    break;
                }
                else
                    ans[i]=p[i];
            }
        }
        ans[n-1]=p[n-1];
        return ans;
    }
}
