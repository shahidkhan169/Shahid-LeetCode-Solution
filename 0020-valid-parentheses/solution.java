class Solution {
    public boolean isValid(String s) {
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
            if((ch==')' && stack.peek()=='(') || (ch==']' && stack.peek()=='[') || (ch=='}' && stack.peek()=='{')  )
            {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size()==0;
    }
}
