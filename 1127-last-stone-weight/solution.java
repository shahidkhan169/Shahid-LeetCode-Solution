class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pri=new PriorityQueue<>((a,b)->b.compareTo(a));
        for(int i:stones)
            pri.add(i);
        if(pri.size()==1)
            return pri.poll();
        while(pri.size()!=1 && !pri.isEmpty())
        {
            int x=pri.poll();
            int y=pri.poll();
            if(x!=y)
            {
                pri.add(x-y);
                // System.out.println(sub)
            }
            if(pri.size()==1)
                return pri.poll();
        }
        return 0;
    }
}
