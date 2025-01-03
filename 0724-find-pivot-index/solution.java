class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
            sum+=nums[i];
        int ls=0;
        int rs=0;
        for(int i=0;i<n;i++)
        {
            rs=sum-(nums[i]+ls);
            if(rs==ls)
                return i;
            ls+=nums[i];
        }
        return -1;
    }
}
