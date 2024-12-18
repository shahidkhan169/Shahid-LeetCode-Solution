class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        Map<String,Integer> map=new HashMap<>();
        int n=s.length();
        int inc=n/k;
        for(int i=0;i<n;i+=inc)
        {
            String str=s.substring(i,i+inc);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(int i=0;i<n;i+=inc)
        {
            String str=t.substring(i,i+inc);
            if(map.getOrDefault(str,0)>0)
            {
                map.put(str,map.getOrDefault(str,0)-1);
            }
            else
                return false;
        }
        return true;
    }
}
