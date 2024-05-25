char* removeStars(char* s) {
    int len=strlen(s);
    int i=0;
    int top=0;
    for(int i=0;i<len;i++)
    {
           if(s[i]!='*')
           {
                s[top++]=s[i];
           }   
           else
                top--;
    }
    s[top]='\0';
    return s;
}
