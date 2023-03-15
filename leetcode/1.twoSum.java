class Solution {

    class Pair implements Comparable<Pair>{
        int val;
        int idx;
         
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Pair o){
            return this.val - o.val;
        }

    }
    public int[] twoSum(int[] nums, int target) {
        Pair[] pairs = new Pair [nums.length];
        for(int i = 0;i<nums.length;i++){
            pairs[i] = new Pair(nums[i],i);
        }

        Arrays.sort(pairs);

        int [] res = new int[2];
        int li = 0;
        int ri = nums.length-1;

        while(li<ri){
            int l = pairs[li].val;
            int r = pairs[ri].val;

            if(l+r<target){
                li++;
            }else if(l+r>target){
                ri--;
            }else{
                res[0] = pairs[li].idx;
                res[1] = pairs[ri].idx;
                break;
            }
        }

        return res;
        
    }
}
