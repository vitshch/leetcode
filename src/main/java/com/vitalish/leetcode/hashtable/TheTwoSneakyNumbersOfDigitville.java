package com.vitalish.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * 3289. The Two Sneaky Numbers of Digitville
 * Topics: Array, Hash Table, Math
 *
 * @see https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/
 */
public class TheTwoSneakyNumbersOfDigitville {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        Set<Integer> items = new HashSet<>();

        int index = 0;
        for (int num : nums) {
            if (items.contains(num)) {
                result[index++] = num;
                if (index == 2) {
                    break;
                }
            } else {
                items.add(num);
            }
        }
        return result;
    }

}
