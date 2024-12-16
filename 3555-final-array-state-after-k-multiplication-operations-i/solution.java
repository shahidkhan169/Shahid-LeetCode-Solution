class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<k;i++)
        {
            arr=getMin(nums);
            nums[arr[1]]=arr[0]*multiplier;
        }
        return nums;
    }
    private int[] getMin(int[] nums)
    {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                idx=i;
            }
        }
        return new int[]{min,idx};
    }
}
