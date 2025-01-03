class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        long ls=0;
        long rs=0;
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            ls+=nums[i];
            rs=sum-ls;
            if(ls>=rs)
                c++;
        }
        return c;
    }
}
