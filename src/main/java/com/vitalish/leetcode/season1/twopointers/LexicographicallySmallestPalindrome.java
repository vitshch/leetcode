package com.vitalish.leetcode.season1.twopointers;

/**
 * 2697. Lexicographically Smallest Palindrome
 *
 * @see https://leetcode.com/problems/lexicographically-smallest-palindrome/description/
 * <p>
 * Tag: two-pointers
 */
public class LexicographicallySmallestPalindrome {

    public String makeSmallestPalindrome(String s) {
        var chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (chars[left] > chars[right]) {
                chars[left] = chars[right];
            }
            if (chars[left] < chars[right]) {
                chars[right] = chars[left];
            }
            left++;
            right--;
        }

        return String.valueOf(chars);
    }

}
