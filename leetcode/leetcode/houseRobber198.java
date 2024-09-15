package java;
// class Solution {
//     public int rob(int[] nums) {

//         int osum = 0;
//         int esum = 0;

//         for(int i = 0; i<nums.length; i++){
//             if(i%2 == 0){
//                 osum += nums[i];
//             } else {
//                 esum += nums[i];               
//             }
//         }

//         return (osum > esum ) ? osum : esum;
        
//     }
// }

// ******* NOT WORKING *******



class Solution {
    public int rob(int[] nums) {
        int maxRobbed = 0;
        int maxNotRobbed = 0;

        for(int num: nums) {

            int curRob = maxNotRobbed + num;
            int curNoRob = Math.max(maxNotRobbed, maxRobbed);

            maxRobbed = curRob;
            maxNotRobbed = curNoRob;

        }

        return Math.max(maxRobbed, maxNotRobbed);
    }
}