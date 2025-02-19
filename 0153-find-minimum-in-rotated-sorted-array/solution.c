int findMin(int* nums, int n) {
    if(nums[0]<=nums[n-1])
        return nums[0];
    int l=0,r=n-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(nums[mid]>nums[n-1])
            l=mid+1;
        else r=mid-1;
    }
    return nums[l];
}
