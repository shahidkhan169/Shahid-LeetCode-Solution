import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        // Create a copy of the scores array
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        // Sort the index array based on the scores
        Arrays.sort(index, (a, b) -> score[b] - score[a]);

        // Prepare the rank strings
        String[] ans = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] fin = new String[n];

        // Assign ranks based on the sorted index array
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                fin[index[i]] = ans[i];
            } else {
                fin[index[i]] = String.valueOf(i + 1);
            }
        }

        return fin;
    }
}

