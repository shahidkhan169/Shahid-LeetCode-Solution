bool searchMatrix(int** matrix, int n, int* m, int t) {
    int low=0;
    int high=n*(*m)-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        int row=mid/ *m;
        int col=mid% *m;
        if(matrix[row][col]==t)
        {
            return true;
        }
        else if(t > matrix[row][col])
            low=mid+1;
        else
            high=mid-1;
        
    }
    return false;
}
