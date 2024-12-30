class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        System.out.println(list.size());
        System.out.println(list);

        if(list.size()%2==0)
        {
            int k=list.size()/2;
            return ((double)list.get(k)+list.get(k-1))/2;
        }
        else{
            int k=list.size()/2;
            return list.get(k);
        }
    }
}
