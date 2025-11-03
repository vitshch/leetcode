package com.vitalish.leetcode.season1.stack;

/**
 * 2390. Removing Stars From a String
 *
 * @see https://leetcode.com/problems/removing-stars-from-a-string/description/
 */
public class RemovingStarsFromString {

    public String removeStars(String s) {
        var sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
