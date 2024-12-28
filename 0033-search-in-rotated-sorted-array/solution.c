int search(int* a, int n, int t) {
    int l=0,r=n-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(a[mid]==t)
            return mid;
        if(a[l]<=a[mid])
        {
            if(a[l]<=t && t<=a[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        else
        {
            if(a[mid]<=t && t<=a[r])
                l=mid+1;
            else
                r=mid-1;
        }
    }
    return -1;
}
