class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list=new ArrayList<>();
        int r=mat.length;
        int c=mat[0].length;
        int left=0,right=c-1,top=0,bottom=r-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                list.add(mat[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(mat[i][left]);
                }
                left++;
            }
    
        }
        return list;
    }
}
