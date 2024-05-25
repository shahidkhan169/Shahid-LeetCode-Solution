char* reverseVowels(char* s) {
    int n=strlen(s);
    int c=0;
    int v[100000];
    for(int i=n-1;i>=0;i--)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
        {
            v[c++]=s[i];
        }
    }
    v[c]='\0';
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
        {
            s[i]=v[count++];
        }
    }
    return s;
}
