class Solution {
    public String reverseWords(String s) {
        s=s.strip();
        s=s.replaceAll("\\s+"," ");
        List<String> list=new ArrayList<>();
        String out="";
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                list.add(out);
                out="";
            }
            else
                out+=String.valueOf(s.charAt(i));     
        }
        list.add(out);
        String ans="";
        for(int i=list.size()-1;i>=0;i--)
        {
            ans+=list.get(i);
            if(i!=0)
                ans+=" ";
        }
        return ans;
    }
}
