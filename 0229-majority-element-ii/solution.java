class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
    Map<Integer,Integer> map=new HashMap<>();
        double size=Math.floor(nums.length/3);
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        List<Integer> ans=new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>size)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}



