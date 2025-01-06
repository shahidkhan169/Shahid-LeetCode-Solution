class Solution {
    public int[][] generateMatrix(int n) {
        int inc=1;
        int[][] mat=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        while(left<=right && top<=right)
        {
            for(int i=left;i<=right;i++)
            {
                mat[top][i]=inc;
                inc++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                mat[i][right]=inc;
                inc++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    mat[bottom][i]=inc;
                    inc++;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    mat[i][left]=inc;
                    inc++;
                }
                left++;
            }
        }
        return mat;
    }
}
