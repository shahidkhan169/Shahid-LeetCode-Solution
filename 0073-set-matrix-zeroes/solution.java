class Solution {
    public void setZeroes(int[][] matrix) {
         int n=matrix.length;
        int m=matrix[0].length;
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];
        int i,j,k,l;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(row[i]||col[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
         for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
       }
    }
}
