class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minSoFar){
                minSoFar=prices[i];
            }
            profit=Math.max(prices[i]-minSoFar,profit);
        }
        return profit;
    }
}
