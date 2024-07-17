class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_so_far = prices[0];
        int profit = 0;

        for(int i=1;i<n;i++){
            if(prices[i] < min_so_far){
                min_so_far = prices[i];
            }
            profit = Math.max(profit,prices[i]-min_so_far);
        }
        return profit;
   }
}
