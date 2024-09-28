int lengthOfLastWord(char* s) {
    int count=1;
    for(int i=1;s[i];i++)
    {
        if(s[i]==' ')continue;
        if(s[i-1]==' ') count=0;
        count++;
    }
    return count;
}
