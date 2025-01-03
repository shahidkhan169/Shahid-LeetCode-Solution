class Solution {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        String ans="";
        int v=num;
        if(num<0)
            num=-1*num;
        while(num>0)
        {
            int r=num%7;
            ans=String.valueOf(r)+ans;
            num=num/7;
        }
        if(v<0)
            ans="-"+ans;
        return ans;
    }
}
