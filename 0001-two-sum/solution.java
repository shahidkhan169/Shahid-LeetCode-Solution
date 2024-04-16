import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    myList.add(i);
                    myList.add(j);
                }
            }
        }
        
       
        int[] result = new int[myList.size()];
        for (int i = 0; i < myList.size(); i++) {
            result[i] = myList.get(i);
        }
        return result;
    }
}

