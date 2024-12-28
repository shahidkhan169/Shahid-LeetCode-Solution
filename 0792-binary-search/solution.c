int search(int* arr, int n, int t) {
    int l=0,r=n-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(arr[mid]==t) return mid;
        else if(t>arr[mid]) l=mid+1;
        else r=mid-1;
    }
    return -1;
    
}
