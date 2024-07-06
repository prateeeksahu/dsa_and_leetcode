// https://leetcode.com/problems/bag-of-tokens/description/?envType=daily-question&envId=2024-03-04

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        int s = 0;
        int m = s;
        Arrays.sort(tokens);

        int j = 0;
        int k = tokens.length-1;

        while(j<=k){
            if(tokens[j]<=power){
                power-=tokens[j++];
                s++;
            } else if(s>0){
                power+=tokens[k--];
                s--;
            } else {
                break;
            }
            m = Math.max(s,m);
        }

        return m;
        
    }
}
