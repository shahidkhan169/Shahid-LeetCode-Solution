class Solution {
    public int maxChunksToSorted(int[] arr) {
        int c=0,max=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            if(max==i)
                c++;
        }
        return c;
    }
}
