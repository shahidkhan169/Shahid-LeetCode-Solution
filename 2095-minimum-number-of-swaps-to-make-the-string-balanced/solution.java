class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack=new Stack<>();
        int b=0;
        int mb=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[')
                b++;
            else
                b--;
            mb=Math.max(mb,-b);
        } 
       return (mb+1)/2;
    }
}
