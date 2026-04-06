class Solution {
     public int maxProfit(int[] prices) {
        int first=0;
        int second=1;
        int maxProfit=0;
        for(second=1;second<prices.length;second++){
            if(prices[second]>prices[first]){
                maxProfit=Math.max(maxProfit, prices[second]-prices[first]);
            }else{
                first=second;
            }
        }
        return maxProfit;
     }
}
