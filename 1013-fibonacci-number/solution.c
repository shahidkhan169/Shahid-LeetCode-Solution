int fib(int n){
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    else
    {
        int c,i;
        i=0;
        int a=0,b=1;
        while(i+1<n)
        {
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
    return -1;
        
}
