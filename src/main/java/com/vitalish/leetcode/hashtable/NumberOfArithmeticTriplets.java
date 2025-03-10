package com.vitalish.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * 2367. Number of Arithmetic Triplets
 * Topics: Array, Hash Table
 *
 * @see https://leetcode.com/problems/number-of-arithmetic-triplets/description/
 */
public class NumberOfArithmeticTriplets {

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num - diff);
        }

        for (int num : nums) {
            int prev = num - diff;
            int next = num - 2 * diff;

            if (set.containsAll(Set.of(prev, num, next))) {
                count++;
            }
        }

        return count;
    }

}
