// https://leetcode.com/problems/find-the-pivot-integer/description/ 

class Solution {
    public int pivotInteger(int n) {

        if(n == 1) return n;

        int i = 1;
        int j = n;
        int sl = 1;
        int sr = n;


        while(i<j){
            //if(i>j) break;

            if(sl<sr) sl+=++i;
            else sr+=--j;
            
            if(sl == sr && i+1 == j-1) return ++i;

            
        }

        return -1;
        
    }
}





    

