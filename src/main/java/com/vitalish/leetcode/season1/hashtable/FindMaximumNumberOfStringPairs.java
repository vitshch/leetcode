package com.vitalish.leetcode.season1.hashtable;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 2744. Find Maximum Number of String Pairs
 * Topics: Array, Hash Table, String
 *
 * @see https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
 */
public class FindMaximumNumberOfStringPairs {

    public int maximumNumberOfStringPairs(String[] words) {
        int numberOfParis = 0;

        Set<String> reversed = new HashSet<>();
        for (String word : words) {
            if (reversed.contains(word)) {
                numberOfParis++;
                reversed.remove(word);
            } else {
                reversed.add(new StringBuilder(word).reverse().toString());
            }
        }
        return numberOfParis;
    }
}
