// https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/?envType=daily-question&envId=2024-02-15

class Solution {
    public long largestPerimeter(int[] nums) {

        if(nums.length<3) return -1;

        Arrays.sort(nums);

        long sum = 0;

        for(long n : nums){
            sum += n;
        }

        for(int i = nums.length - 1; i>=0; i--){
            sum -= nums[i];
            if(sum>nums[i]) return sum + nums[i];
        }

        return -1;
    }
}
