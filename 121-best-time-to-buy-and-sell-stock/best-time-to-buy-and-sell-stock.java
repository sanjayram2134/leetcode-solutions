class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int max = 0;
        int minPrice = Integer.MAX_VALUE;;
        for(int i=0;i<l;i++)
        {
           minPrice = Math.min(minPrice, prices[i]);
           max = Math.max(max, prices[i] - minPrice);
        }
        return max;
    }
}