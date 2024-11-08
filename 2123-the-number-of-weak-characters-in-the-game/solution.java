class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        int n=arr.length;
        int c=0;
        Arrays.sort(arr,(a,b)->(b[0]==a[0])?(a[1]-b[1]):(b[0]-a[0]));
        int max=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i][1]<max)
                c++; 
           max=Math.max(max,arr[i][1]);
        }
        
        return c;
    }
}
