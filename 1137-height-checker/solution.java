import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int len=heights.length;
        int[] expected=Arrays.copyOf(heights,len);
        Arrays.sort(expected);int count=0;for(int i=0;i<len;i++){if(heights[i]!=expected[i])
                count++;}
        return count;}}
