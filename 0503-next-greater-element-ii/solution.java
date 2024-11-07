class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int[]res=new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }
        for(int e:nums)
            list.add(e);
        for(int e:nums)
            list.add(e);

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j)>nums[i])
                {
                    res[i]=list.get(j);
                    break;
                }
            }
        }
        //System.out.println();
        return res;
    }
}
