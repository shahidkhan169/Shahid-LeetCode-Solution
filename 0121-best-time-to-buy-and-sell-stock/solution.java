class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int n=prices.length;
        int max=0,current_profit=0;
        for(int selIdx=0;selIdx<n;selIdx++)
        {
            min=Math.min(prices[selIdx],min);
            current_profit=prices[selIdx]-min;
            max=Math.max(max,current_profit);
        }
        return max;
    }
}
