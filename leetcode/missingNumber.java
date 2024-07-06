// https://leetcode.com/problems/missing-number/description/?envType=daily-question&envId=2024-02-20

class Solution {
    public int missingNumber(int[] nums) {
        int s = 0;
        int ns = 0;

        for (int i = 0; i < nums.length; i++) {
            s += i;
            ns += nums[i];
        }

        s += nums.length;

        return s-ns;
    }
}


