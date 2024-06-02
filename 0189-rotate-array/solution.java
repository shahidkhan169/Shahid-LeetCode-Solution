class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k = k % len;
        int n=nums.length-k;
        int[] arr=new int[len];
        int l=0;
        if(!(len<=1||k==0||len<k))
        {
        for(int val:nums)
        {
            arr[l]=val;
            l++;
        }
        int j=0;
        for(int i=n;i<arr.length;i++)
        {
            nums[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            nums[j++]=arr[i];
        }
        }
        

    }
}
