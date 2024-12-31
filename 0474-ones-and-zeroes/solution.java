class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] arr=new int[m+1][n+1];
        for(String str:strs)
        {
            int z=0;
            int o=0;
            for(char c:str.toCharArray())
            {
                if(c=='0') z++;
                else o++;
            }
            for(int i=m;i>=z;i--)
            {
                for(int j=n;j>=o;j--)
                {
                    arr[i][j]=Math.max(arr[i][j],arr[i-z][j-o]+1);
                }
            }
        }
        return arr[m][n];
        }
}
