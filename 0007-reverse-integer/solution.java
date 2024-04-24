import java.util.*;
class Solution {
    public int reverse(int x) {
        int y=Math.abs(x);
        long sum=0;
        int r=0;
        while(y>0)
        {
            r=y%10;
            sum=sum*10+r;
            y=y/10;
        }
        if(sum<Integer.MIN_VALUE||sum>Integer.MAX_VALUE){
            return 0;
        }
        String s=String.valueOf(sum);
        String s1=String.valueOf(x);
        if(s1.charAt(0)=='-')
            s='-'+s;
        int ans=Integer.valueOf(s);
        return ans;
    }
}
