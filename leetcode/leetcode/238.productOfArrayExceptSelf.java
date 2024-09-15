class Solution {
    public int[] productExceptSelf(int[] nums) {

        int c = 1;
        int z = 0;

        int [] res = new int[nums.length];

        for(int n : nums){
            if(n == 0){
                z++;
            } else {
                c *= n; 
            }
        }

        if(z>1){
            Arrays.fill(res, 0);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (z == 1 && nums[i] == 0) {
                    res[i] = c;
                } else if (z == 0) {
                    res[i] = c / nums[i];
                }
            }
        }

        
        

        return res;
    }
}

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
