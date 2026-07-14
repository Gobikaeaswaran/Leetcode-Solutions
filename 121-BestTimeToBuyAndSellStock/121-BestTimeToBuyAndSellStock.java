// Last updated: 7/14/2026, 2:02:09 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>p){
                p=prices[i]-min;
            }
        }
        return p;
    }
}