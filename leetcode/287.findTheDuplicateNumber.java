class Solution {
    public int findDuplicate(int[] nums) {

       int s = nums[0];
       int f = nums[0];

       do{
        s = nums[s];
        f = nums[nums[f]];
       } while(s != f);

       f = nums[0];

       while(s != f){
        s = nums[s];
        f = nums[f];
       }

       return s;
	
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {


// 		Arrays.sort(nums);

// 		for(int i = 0; i<nums.length-1;i++){
// 			if(nums[i] == nums[i+1]) return nums[i];
		
// 		} 

//     return 0;
        
//     }
// }
