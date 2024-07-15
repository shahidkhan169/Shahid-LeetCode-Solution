class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            list.add(str);
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); } });
        StringBuilder ans = new StringBuilder();
        for (String s : list) {
            ans.append(s);
        }
        if (ans.charAt(0) == '0') {
            return "0";
        }
        return ans.toString();
    }
}

