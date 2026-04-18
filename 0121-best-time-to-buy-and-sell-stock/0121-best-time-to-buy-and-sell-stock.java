class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < lowest) {
                lowest = price;
            } else {
                if (price - lowest > maxProfit) {
                    maxProfit = price - lowest;
                }
            }
        }
        return maxProfit;
    }
}