package com.vitalish.leetcode.season1.stack;

/**
 * 1021. Remove Outermost Parentheses
 * Topics: Stack
 *
 * @see https://leetcode.com/problems/remove-outermost-parentheses/description/
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        if (s.length() <= 2) {
            return "";
        }
        char[] c = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int left = 1;
        for (int i = 1; i < s.length(); i++) {
            if (c[i] == '(') {
                left++;
                if (left > 1) {
                    result.append('(');
                }
            } else {
                if (left > 1) {
                    result.append(')');
                }
                left--;
            }
        }
        return result.toString();
    }
}
