bool checkPerfectNumber(int num) {
    int i=1;
    int sum=0;
    while(i<=num/2)
    {
        if(num%i==0)
            sum+=i;
        i++;
    }
    if(sum==num)
        return 1;
    return 0;
}
