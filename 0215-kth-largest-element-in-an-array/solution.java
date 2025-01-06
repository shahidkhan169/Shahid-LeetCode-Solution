class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pri=new PriorityQueue<>((a,b) -> b.compareTo(a));
        for(int i:nums)
            pri.add(i);
        for(int i=0;i<k-1;i++)
            pri.poll();
        return pri.poll();
    }
}
