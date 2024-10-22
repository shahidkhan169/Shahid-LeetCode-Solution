import java.util.Hashtable;
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n=list1.length;
        int m=list2.length;
        Hashtable<String,Integer> ht=new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    ht.put(list1[i],i+j);
                }
            }
        }
         /*for (String key : ht.keySet()) {
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
         }*/
         int min=Integer.MAX_VALUE;
         for(int sum:ht.values())
         {
            if(sum<min){
                min=sum;
            }
         }
         List<String> l=new ArrayList<>();
         for (String key : ht.keySet()) {
            if (ht.get(key) == min) {
                l.add(key);
            }
        }
        String[] ans=new String[l.size()];
        for(int i=0;i<l.size();i++)
            ans[i]=l.get(i);

        return ans;
    }
}
