import java.io.*;
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String z=String.valueOf(x);
        String temp="";
        char c;
        for(int i=0;i<z.length();i++)
        {
            c=z.charAt(i);
            temp=c+temp;
        }
      return z.equals(temp);
    }
}
