int findPeakElement(int* nums, int n) {
    int l=0;
    int r=n-1;
    while(l<r)
    {
        int mid=(l+r)/2;
        if(nums[mid]>nums[mid+1])
            r=mid;
        else
            l=mid+1;
    }
    return l;
}
