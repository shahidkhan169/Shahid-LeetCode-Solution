class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> ans=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();
        int n=s.length();
        String str="";
        for(int i=0;i+9<n;i++)
        {
            str=s.substring(i,10+i);
            boolean valid=set.add(str);
            if(!valid)
            {
                ans.add(str);
            }
        }
        list.addAll(ans);
        return list;
    }
}
