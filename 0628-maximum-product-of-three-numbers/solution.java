class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        int m1=nums[n-1]*nums[n-2]*nums[n-3];
        int m2=nums[0]*nums[1]*nums[n-1];
        if(m1>m2)
        {
            System.out.println(m1);
            System.out.println(m2);
            return m1;
        }
        else
        {
            System.out.println(m1);
            System.out.println(m2);
            return m2;
        }
    }
}
