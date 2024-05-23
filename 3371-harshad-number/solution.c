int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum=0;
    int ans=x;
    while(x>0)
    {
        int r=x%10;
        sum+=r;
        x/=10;
    }
    if(ans%sum==0)
    {
        return sum;
    }
    return -1;}
