package com.vitalish.leetcode.stack;

import java.util.Stack;

/**
 * Daily Temperatures
 *
 * @see https://neetcode.io/problems/daily-temperatures
 */
public class DailyTemperatures {

    // 0(n^2)
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int j = i;
            int daysCount = 0;
            while (j < temperatures.length && temperatures[i] >= temperatures[j]) {
                daysCount++;
                j++;
            }
            if (j == temperatures.length) {
                result[i] = 0;
            } else {
                result[i] = daysCount;
            }
        }
        return result;
    }

    // O(n)
    public int[] dailyTemperatures2(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                int j = stack.pop();
                result[j] = i - j;
            }
            stack.push(i);
        }
        return result;
    }
}
