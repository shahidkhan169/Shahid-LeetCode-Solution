class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        int n=rectangles.length;
        long count=0;
        Map<Double,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            double div=(double)rectangles[i][0]/rectangles[i][1];
            if(map.containsKey(div))
            {
                count+=map.get(div);
                map.put(div,map.get(div)+1);
            }
            else
                map.put(div,1);
        }
        return count;
    }
}
