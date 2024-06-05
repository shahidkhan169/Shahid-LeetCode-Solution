class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int r = queries.length;
        boolean[] bool = new boolean[r];
        
        // Preprocess the nums array to create the prefixParityChange array
        int[] prefixParityChange = new int[n];
        for (int i = 1; i < n; i++) {
            prefixParityChange[i] = prefixParityChange[i - 1] + (nums[i - 1] % 2 != nums[i] % 2 ? 1 : 0);
        }

        // Answer each query using the prefixParityChange array
        for (int i = 0; i < r; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            // Calculate the number of parity changes in the range [start, end]
            int parityChanges = prefixParityChange[end] - prefixParityChange[start];
            
            // If the number of parity changes is equal to end - start, the subarray has alternating parity
            bool[i] = (parityChanges == end - start);
        }
        
        return bool;
    }
}

