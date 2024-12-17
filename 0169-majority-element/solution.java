class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int size=nums.length/2;
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        int ans=0;
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>size)
            {
                ans=entry.getKey();
            }
        }
        return ans;
    }
}
