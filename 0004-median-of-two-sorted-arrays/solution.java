import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j;
        List<Integer> l=new ArrayList<Integer>();
        for(i=0;i<nums1.length;i++)
        {
            l.add(nums1[i]);
        }
        for(i=0;i<nums2.length;i++)
        {
            l.add(nums2[i]);
        }
        int[] arr=new int[l.size()];
        for(i=0;i<l.size();i++)
        {
            arr[i]=l.get(i);
        }
        int n=arr.length;
        Arrays.sort(arr);
        double ans;
        if(n%2==0)
        {
            int k=n/2;
            ans=(arr[k-1]+arr[k])/2.0;
        }
        else
        {
            int k=n/2;
            ans=arr[k];
        }
        return ans;
    }
}
