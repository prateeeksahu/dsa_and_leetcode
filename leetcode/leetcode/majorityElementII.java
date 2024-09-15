// https://leetcode.com/problems/majority-element-ii/description/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ele1 = 0;
        int elecnt1 = 0;   
        int ele2 = 0;
        int elecnt2 = 0;    

        for(int i = 0; i<nums.length; i++){
            if(elecnt1 == 0 && nums[i] != ele2){
                elecnt1 = 1;
                ele1 = nums[i];
            } else if (elecnt2 == 0 && nums[i] != ele1){
                elecnt2 = 1;
                ele2 = nums[i];
            }else if(nums[i] == ele1){
                elecnt1++;
            }else if(nums[i] == ele2){
                elecnt2++;
            }else {
                elecnt2--;
                elecnt1--;
            }
        } 

        List<Integer> res = new ArrayList<>();
        int t = nums.length/3;

        elecnt1 = 0;
        elecnt2 = 0;

        for(int i = 0; i<nums.length; i++){
            if(ele1 == nums[i]) elecnt1++;
            else if(ele2 == nums[i]) elecnt2++;
        }

        if (elecnt1>t) res.add(ele1);
        if (elecnt2>t) res.add(ele2);

        return res;

    }
}
