// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int r = 0;
        int m = Integer.MIN_VALUE;

        for (int num : nums) {
            freq[num]++;
            if (freq[num] > m) m = freq[num];
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == m) r += freq[i];
        }

        return r;
    }
}
