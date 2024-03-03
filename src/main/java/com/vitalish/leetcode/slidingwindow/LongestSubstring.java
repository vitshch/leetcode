package com.vitalish.leetcode.slidingwindow;

import java.util.*;

/**
 * Longest Substring Without Repeating Characters
 * <p>
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            var current = s.charAt(r);
            if (charIndexMap.containsKey(current) && charIndexMap.get(current) >= l) {
                l = charIndexMap.get(current) + 1;
            } else {
                maxLength = Integer.max(r - l + 1, maxLength);
            }
            charIndexMap.put(current, r);
        }
        return maxLength;
    }

}
