import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            List<String> group=map.getOrDefault(sorted,new ArrayList<>());
            group.add(strs[i]);
            map.put(sorted,group);
       }
       return new ArrayList<>(map.values());
    }
    
}

