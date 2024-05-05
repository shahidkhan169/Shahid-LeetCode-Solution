class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        if (str.isEmpty()) {
            return 0;
        }

        String ans = "";
        int sign = 1;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            ans += str.charAt(0);
            sign = str.charAt(0) == '-' ? -1 : 1;
        }

        for (int i = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                ans += str.charAt(i);
            } else {
                break;
            }
        }

        if (ans.length() == 0 || (ans.length() == 1 && !Character.isDigit(ans.charAt(0)))) {
            return 0;
        }

        long result = 0;
        try {
            result = Long.parseLong(ans);
        } catch (NumberFormatException e) {
            result = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}

