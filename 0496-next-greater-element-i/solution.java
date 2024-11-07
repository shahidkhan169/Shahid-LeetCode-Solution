class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;int n2=nums2.length;
        List<Integer> l1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> l2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n1;i++)
        {
            int index=l2.indexOf(nums1[i]);
            int max=nums2[index];
            for(int j=index;j<n2;j++)
            {
                if(nums2[j]>max)
                {
                    max=nums2[j];
                    break;
                }
            }
            if(nums1[i]==max)
                res.add(-1);
            else
                res.add(max);
        }
        int[] ans=res.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}
