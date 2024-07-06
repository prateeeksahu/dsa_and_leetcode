// https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int c = 0;

        for(int h : hours){
            if(h>=target) c++;
        }

        return c;
        
    }
}