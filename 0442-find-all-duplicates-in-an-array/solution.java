class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int e:nums)
            map.put(e,map.getOrDefault(e,0)+1);
        for(HashMap.Entry <Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==2)
                list.add(entry.getKey());
        }
        return list;
    }
}
