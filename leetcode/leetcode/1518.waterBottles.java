class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int botcanbuy = 0, botremain = 0, ans = 0, total = numBottles;

        while(total >= numExchange){
            botcanbuy = total/numExchange;
            botremain = total%numExchange;
            total = botcanbuy+botremain;
            ans += botcanbuy*numExchange;
        }

        return ans + total;
        
    }
}
