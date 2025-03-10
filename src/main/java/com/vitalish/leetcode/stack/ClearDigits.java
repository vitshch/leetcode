package com.vitalish.leetcode.stack;

/**
 * 3174. Clear Digits
 * Topics: Stack
 *
 * @see https://leetcode.com/problems/clear-digits/description/
 */
public class ClearDigits {

    public String clearDigits(String s) {
        var res = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isDigit(character)) {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(character);
            }
        }
        return res.toString();
    }

}
