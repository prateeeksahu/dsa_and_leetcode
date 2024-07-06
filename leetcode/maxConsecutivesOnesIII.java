package java;
// https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {

        // int i = 0;
        // int res = 0;
        

        // while(i<nums.length){
        //     int j = i;
        //     int cc = 0;
        //     int cz = k;

        //     while(j<nums.length && (cz>0 || nums[j] == 1)){
        //         if(nums[j] == 0){
        //             cz--;
        //         }
        //         j++;
        //         cc++;
        //     }

        //     res = Math.max(cc,res);
        //     i++;
            
        // }
        

        // return res;


        int i = 0;
        int j = 0;
        int res = 0;
        int cz = 0;

        while(j<nums.length){

            if(nums[j] == 0){
                cz++;
            }

            while(cz>k){
                if(nums[i] == 0){
                    cz--;
                }
                i++;
            }

            res = Math.max(j-i + 1,res);
            j++;
        }

        return res;
    }
}