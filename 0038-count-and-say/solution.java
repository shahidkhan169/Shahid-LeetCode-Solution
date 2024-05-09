class Solution {
    public String countAndSay(int n) {
        String curr="1";
        for(int i=1;i<n;i++)
        {
            String next="";
            int itr=0;
            while(itr<curr.length())
            {
                int count=1;
                while(itr<curr.length()-1 && curr.charAt(itr)==curr.charAt(itr+1))
                {
                    count++;
                    itr++;
                }
                next+=Integer.toString(count)+curr.charAt(itr);
                itr++;
            }
            curr=next;
        }
        return curr;
    }
}
