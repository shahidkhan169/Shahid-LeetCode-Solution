bool searchMatrix(int** matrix, int n, int* m, int t){
    int row=0;
    int col=*m-1;
    while(row<n && col>=0)
    {
        if(t==matrix[row][col])
            return true;
        else if(t>matrix[row][col])
            row++;
        else
            col--;
    }
    return false;
}
