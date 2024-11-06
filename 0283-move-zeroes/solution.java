class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=left+1;
        while(right<n)
        {
            if(nums[right]!=0 && nums[left]==0)
            {
                nums[left]=nums[right];
                nums[right]=0;
                left++;
            }
            else if(nums[left]!=0)
                left++;
            right++;
        }
        
    }
}
