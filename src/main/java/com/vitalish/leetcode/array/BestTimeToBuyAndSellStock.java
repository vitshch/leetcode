package com.vitalish.leetcode.array;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int margin = 0;
        int currentMargin = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            currentMargin = prices[i] - min;
            if (currentMargin > margin) {
                margin = currentMargin;
            }
        }
        return margin;
    }

}
