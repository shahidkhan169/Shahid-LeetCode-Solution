/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* num, int n, int t, int* returnSize) {
    int *arr=(int *)malloc(sizeof(int)*2);
    int l=0,r=n-1;
    while(l<=r)
    {
        int sum=num[l]+num[r];
        if(sum==t)
        {
            arr[0]=l+1;
            arr[1]=r+1;
            break;
        }
        else if(t>sum) l++;
        else r--;
    }
    *returnSize=2;
    return arr;
}
