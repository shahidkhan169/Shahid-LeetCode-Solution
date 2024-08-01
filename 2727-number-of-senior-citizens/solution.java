import java.util.*;
class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details)
        {
            String sage=String.valueOf(s.charAt(11))+String.valueOf(s.charAt(12));
            int age=Integer.parseInt(sage);
            if(age>60)
                count++;
        }
        return count;
    }
}
