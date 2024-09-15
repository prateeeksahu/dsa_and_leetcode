package java;
// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/?envType=daily-question&envId=2024-01-04

class Solution {
    public int minOperations(int[] nums) {

        Arrays.sort(nums);
        int step = 0;

        int [] c = new int[(nums[nums.length-1])+1];
        Arrays.fill(c, 0);

        for(int i = 0; i<nums.length; i++){
           c[nums[i]]++;
        }
        

        for(int i = 0; i<c.length;i++){
            if(c[i] == 1){
                return -1;
            } else if(c[i] % 3 == 0){
                step += (c[i]/3);
            }else if ( c[i] % 3 == 2 || c[i] % 3 == 1 ){
                step += (c[i]/3)+1;
            }
        }

        return step;
    }
}