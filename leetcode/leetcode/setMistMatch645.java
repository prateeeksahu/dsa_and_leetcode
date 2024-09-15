// https://leetcode.com/problems/set-mismatch/?envType=daily-question&envId=2024-01-22

class Solution {
    public int[] findErrorNums(int[] nums) {
    
        int[] v = new int[nums.length + 1];
        int m = 0, d = 0;

        for (int i = 0; i < nums.length; i++) {
            v[nums[i]]++;
        }

        for (int i = 1; i < v.length; i++) {
            if (v[i] == 2) {
                d = i;
            }
            if (v[i] == 0) {
                m = i;
            }
        }

        return new int[]{d, m};
    }
}



