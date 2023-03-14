class Solution {
    public int searchInsert(int[] nums, int target) {

        int hi = nums.length-1;
        int lo = 0;

        while(lo<=hi){
            int mid = (hi+lo)/2;
            if( nums[mid] == target){
                return mid;
            }
            
            else if(nums[mid] < target ){
                lo = mid+1;
            }
            
            
            else {
                hi = mid-1;
            } 
            
        }
        return lo;
        
    }
}
