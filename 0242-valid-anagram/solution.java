class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int n=t.length();
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)==0)
                map.remove(c);
            }
            else{
                return false;
            }

        }
        return map.isEmpty();
    }
}
