// https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {

        int csum = 0;

        for(int i = 0; i<nums.length; i++){

            csum += nums[i];
            nums[i] = csum;
        }

        return nums;
        
    }
}