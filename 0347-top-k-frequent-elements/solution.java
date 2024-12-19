class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pri=new PriorityQueue<>((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        pri.addAll(map.entrySet());
        int i=0;
        while(!pri.isEmpty() && i<k)
        {
            Map.Entry<Integer,Integer> val=pri.poll();
            list.add(val.getKey());
            i++;
        }
        int[] arr=new int[list.size()];
        int j=0;
        for(int e:list)
            arr[j++]=e;
        System.out.println(list);
        return arr;
    }
}
