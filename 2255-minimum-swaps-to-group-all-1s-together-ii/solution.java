class Solution {
    public int minSwaps(int[] nums) {
        int k=Arrays.stream(nums).sum();
        int n=nums.length;
        int max=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            count+=nums[i];
        }
        max=count;
        for(int i=k;i<n+k;i++)
        {
            count+=nums[i%n]-nums[(i-k+n)%n];
            max=Math.max(count,max);
        }
        return k-max;
    }
}
