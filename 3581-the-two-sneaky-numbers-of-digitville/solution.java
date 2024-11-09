class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int[] arr=new int[2];
        int k=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==2)
                arr[k++]=entry.getKey();
        }
        return arr;
    }
}
