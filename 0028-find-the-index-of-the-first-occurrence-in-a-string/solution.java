class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
            int x=haystack.indexOf(needle);
            return x;
        }
        else
        {
            return -1;
        }
    }
}
