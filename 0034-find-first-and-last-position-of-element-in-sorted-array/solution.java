class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
                l.add(i);
        }
        if(l.size()!=0)
        {
            int[] ans={l.get(0),l.get(l.size()-1)};
            return ans;
        }    
        else
        {
            int[] ans={-1,-1};
            return ans;
        }
    }
}
