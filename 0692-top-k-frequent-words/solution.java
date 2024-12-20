class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<String,Integer>> pri=new PriorityQueue<>(
            (e1,e2)-> {
            int comp=e2.getValue().compareTo(e1.getValue());
            if(comp==0)
            {
                return e1.getKey().compareTo(e2.getKey());
            }
            return comp;
            }
        );
        List<String> list=new ArrayList<>();
        for(String str:words)
            map.put(str,map.getOrDefault(str,0)+1);
        pri.addAll(map.entrySet());
        int i=0;
        while(!pri.isEmpty() && i<k)
        {
            Map.Entry<String,Integer> value=pri.poll();
            list.add(value.getKey());
            i++;
        }
        return list;
    }
}
