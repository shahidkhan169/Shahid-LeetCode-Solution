class Solution {
    public int[] vowelStrings(String[] w, int[][] queries) {
        int n=w.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++)
        {
            int s=w[i].charAt(0);
            int e=w[i].charAt(w[i].length()-1);
            if((s=='a' || s=='e' || s=='i' || s=='o'|| s=='u') && (e=='a' || e=='e' || e=='i' || e=='o'|| e=='u'))
                prefix[i+1]=prefix[i]+1;
            else
                prefix[i+1]=prefix[i];
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int l=queries[i][0];
            int r=queries[i][1];
            res[i]=prefix[r+1]-prefix[l];
        }
        return res;
    }
}
