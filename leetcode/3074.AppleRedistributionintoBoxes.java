// https://leetcode.com/problems/apple-redistribution-into-boxes/description/

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int asum = 0;

        for( int a : apple){asum += a;}

        Arrays.sort(capacity);
        int csum = 0;
        int i = capacity.length-1;

        while(csum<asum){
            csum += capacity[i];
            i--;
        }

        return capacity.length - i - 1;

    }
}
