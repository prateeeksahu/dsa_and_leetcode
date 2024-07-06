//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/description/


class Solution {
    public int minDifference(int[] nums) {

        if(nums.length <= 3) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, n = nums.length;

        for(int i = 1; i <= 4; i++) min = Math.min(min, Math.abs(nums[n-i] - nums[4-i]));

        return min;


    }
}

