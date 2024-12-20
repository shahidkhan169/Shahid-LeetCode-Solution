class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pri=new PriorityQueue<>((n1,n2)->n2.compareTo(n1));
        for(int e:nums)
        {
            pri.add(e);
        }
        int i=0;
        while(!pri.isEmpty() && i!=k-1)
        {
            pri.poll();
            i++;
        }
        return pri.poll();
    }
}
