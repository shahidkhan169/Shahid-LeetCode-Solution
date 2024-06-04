import java.util.*;
class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        Integer[] arr=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> list=Arrays.asList(arr);
        Collections.shuffle(list);
        int[] ans=list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
