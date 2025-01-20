char* removeOuterParentheses(char* s) {
    int n=strlen(s);
    char *res=malloc(sizeof(char)*n);
    int o=0;
    int idx=0;
    int i;
    for(i=0;i<n;i++)
    {
        if(s[i]=='(')
            o++;
        if(o>1)
            res[idx++]=s[i];
        if(s[i]==')')
            o--;
    }
    res[idx]='\0';
    return res;
}
