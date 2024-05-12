class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}
