class Solution {
    public boolean isArraySpecial(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]%2==1 && nums[i+1]%2==1)||(nums[i]%2==0 && nums[i+1]%2==0))
            {
                f=1;
                break;
            }
        }
        if(f==1)
            return false;
        return true;
    }
}
