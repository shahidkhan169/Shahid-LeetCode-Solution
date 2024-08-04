class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                    sum+=nums[j];
                    list.add(sum);
            }
        }
        Integer[] arr = list.toArray(new Integer[0]);
        Arrays.sort(arr);
        int ans=0;
        int MOD=1000000007;
        for(int i=left-1;i<right;i++)
            ans=(ans+arr[i])%MOD;
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return ans;
    }
}
