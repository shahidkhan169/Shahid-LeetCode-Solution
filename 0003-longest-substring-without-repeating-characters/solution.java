import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        String test = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                // Remove characters from the beginning of test
                // until the first occurrence of s.charAt(i) is removed
                while (test.charAt(0) != s.charAt(i)) {
                    set.remove(test.charAt(0));
                    test = test.substring(1);
                }
                set.remove(test.charAt(0));
                test = test.substring(1);
            }
            set.add(s.charAt(i));
            test += s.charAt(i);
            maxLength = Math.max(maxLength, test.length());
        }
        return maxLength;
    }
}

