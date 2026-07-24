class Solution {
    public int maxProfit(int[] prices) {
        // Step 1: Track the lowest buying price we've seen so far
        int minPriceSoFar = prices[0];
        
        // Step 2: Track the maximum profit we can make
        int maxProfit = 0;

        // Step 3: Walk through the prices starting from day 2 (index 1)
        for (int i = 1; i < prices.length; i++) {
            
            // If today's price is higher than our min price, check the potential profit
            if (prices[i] > minPriceSoFar) {
                int currentProfit = prices[i] - minPriceSoFar;
                maxProfit = Math.max(maxProfit, currentProfit);
            } 
            // Otherwise, we found a brand new lowest price to buy at for future days
            else {
                minPriceSoFar = prices[i];
            }
        }

        return maxProfit;
    }
}