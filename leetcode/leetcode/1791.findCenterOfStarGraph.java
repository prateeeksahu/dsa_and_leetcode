// https://leetcode.com/problems/find-center-of-star-graph/description/

class Solution {
    public int findCenter(int[][] e) {

        if(e[0][0] == e[1][0]) return e[0][0];
        else if(e[0][0] == e[1][1]) return e[0][0];
        else return e[0][1];
        
    }
}
