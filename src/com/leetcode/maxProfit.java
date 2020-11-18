package com.leetcode;
//leetcode 买卖股票的最佳时机直接ac代码如下
public class maxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int i=0;
        for(int j=1;j<prices.length;j++){
            if(prices[i]<prices[j]){
                maxProfit+=prices[j]-prices[i];
            }
            i++;
        }
        return maxProfit;
    }
}
