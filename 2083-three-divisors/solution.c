bool isThree(int n) {
    int num=sqrt(n);
    if(num*num!=n)
        return 0;
    if(num<=1)
        return 0;
    if(num==2)
        return 1;
    if(num%2==0)
        return 0;
    int s=sqrt(num);
    for(int i=3;i<=s;i+=2)
    {
        if(num%i==0)
            return 0;
    }
    return 1;
}
