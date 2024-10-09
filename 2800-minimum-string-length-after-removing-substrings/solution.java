class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(ch);
                continue;
            }
            if(ch=='B' && stack.peek()=='A')
            {
                stack.pop();
            }
            else if(ch=='D' && stack.peek()=='C')
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}