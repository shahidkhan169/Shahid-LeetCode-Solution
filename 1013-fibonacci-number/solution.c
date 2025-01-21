int solve(int n,int *dp)
{
    if(n==0 || n==1)
    {
        dp[n]=n;
        return n;
    }
    if(dp[n]!=-1)
        return dp[n];
    return dp[n]=solve(n-1,dp)+solve(n-2,dp);
}
int fib(int n){
    int dp[n+1];
    for(int i=0;i<=n;i++)
        dp[i]=-1;
    solve(n,dp);
    return dp[n];
}
