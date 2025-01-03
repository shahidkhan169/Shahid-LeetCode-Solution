class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        int ls=0;
        int rs=0;

        for(int i=0;i<n;i++)
        {
            rs=sum-(ls+nums[i]);
            if(ls==rs)
                return i;
            ls+=nums[i];    
        }
        return -1;
    }
}
