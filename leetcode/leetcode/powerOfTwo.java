// https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2024-02-19

class Solution {
    public boolean isPowerOfTwo(int n) {

       if(n < 1073741825){
            int prod = 1;
        
            while(prod <= n){

            if(prod == n) return true;
            prod *= 2;
        }

       }

        return false;
        
    }
}
