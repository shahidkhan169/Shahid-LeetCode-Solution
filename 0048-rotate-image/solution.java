class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               mat[i][j]=matrix[i][j];
            }
            
        }
    
    for(int k=0;k<n;k++)
    {
        for(int l=0;l<n;l++)
        {
               matrix[k][l]=mat[n-l-1][k];
        }
            
        
    }
}
}
