int removeElement(int* nums, int n, int val) {
    int c=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]!=val)
        {
            nums[c]=nums[i];
            c++;
        }
    }
    return c;
}
