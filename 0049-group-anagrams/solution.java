class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char sarr[]=s.toCharArray();
            Arrays.sort(sarr);
            String ss=new String(sarr);
            List<String> list=map.getOrDefault(ss,new ArrayList<>());
            list.add(s);
            map.put(ss,list);
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet())
        {
            res.add(entry.getValue());
        }
        return res;
    }
}
