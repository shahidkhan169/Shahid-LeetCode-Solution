bool isPalindrome(int x) {
    int ans=x;
    long int sum=0;
    while(x>0)
    {
        int r=x%10;
        sum=sum*10+r;
        x=x/10;
    }
    if(ans==sum)
        return true;
    return false;
}
