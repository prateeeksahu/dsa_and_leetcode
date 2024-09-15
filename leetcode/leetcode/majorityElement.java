// https://leetcode.com/problems/majority-element/?source=submission-ac

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}
