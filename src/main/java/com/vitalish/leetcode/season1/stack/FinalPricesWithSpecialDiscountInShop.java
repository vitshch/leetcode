package com.vitalish.leetcode.season1.stack;

import java.util.ArrayDeque;

/**
 * 1475. Final Prices With a Special Discount in a Shop
 * Topics: Set
 *
 * @see https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
 */
public class FinalPricesWithSpecialDiscountInShop {

    public int[] finalPrices(int[] prices) {
        int[] result = prices.clone();
        var stack = new ArrayDeque<Integer>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                result[index] = result[index] - prices[i];
            }
            stack.push(i);
        }
        return result;
    }


    public int[] finalPricesBruteForce(int[] prices) {
        int[] result = prices.clone();

        for (int i = 0; i < prices.length; i++) {
            int j = i + 1;
            while (j < prices.length) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
                j++;
            }
        }

        return result;
    }

}
