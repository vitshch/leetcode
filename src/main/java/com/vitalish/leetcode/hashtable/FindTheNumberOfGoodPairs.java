package com.vitalish.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 3162. Find the Number of Good Pairs I
 * Topics: Array, Hash Table
 *
 * @see https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/
 *
 */
public class FindTheNumberOfGoodPairs {

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums2) {
            int val = num * k;
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        for (int num : nums1) {
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (num % entry.getKey() == 0) {
                    count += entry.getValue();
                }
            }
        }

        return count;
    }

}
