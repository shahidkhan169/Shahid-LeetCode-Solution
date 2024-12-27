int maxSubArray(int* a, int n) {
    int ms=a[0],cs=a[0];
    for(int i=1;i<n;i++)
    {
            if(cs<0) cs=0;
            cs=cs+a[i];
            if(ms<cs)
                ms=cs;
    }
    return ms;
}
