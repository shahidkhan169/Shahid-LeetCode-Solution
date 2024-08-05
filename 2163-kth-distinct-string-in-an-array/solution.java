class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list=new ArrayList<>();
        int n=arr.length;
        Map<String,Integer> count=new HashMap<>();
        for (int i = 0; i < n; i++) {
           count.put(arr[i],count.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(count.get(arr[i])==1)
            {
                if(!list.contains(arr[i]))
                    list.add(arr[i]);
            }
        }
        int m=list.size();
        if(k>m)
            return "";
        
        String ans=list.get(k-1);
        return ans;
    }
}
