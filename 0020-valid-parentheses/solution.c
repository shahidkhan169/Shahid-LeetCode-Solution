bool isValid(char* s) {
    int len=strlen(s);
    int stack[len];
    int top=-1;
    for(int i=0;i<len;i++)
    {
        if(s[i]=='(' || s[i]=='[' || s[i]=='{')
        {
            stack[++top]=s[i];
        }
        else if((s[i]==')' && top>=0 && stack[top]=='(') || (s[i]==']' && top>=0 && stack[top]=='[') || (s[i]=='}' && top>=0 && stack[top]=='{'))
        {
            --top;
        }
        else
            return 0;
    }
    return top==-1;
}
