class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        for(char c:arr)
            map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Map.Entry<Character, Integer>> pri = new PriorityQueue<>((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        pri.addAll(map.entrySet());
        StringBuilder str=new StringBuilder();
        while(!pri.isEmpty())
        {
            Map.Entry<Character,Integer> entry=pri.poll();
            str.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return str.toString();
    }
}
