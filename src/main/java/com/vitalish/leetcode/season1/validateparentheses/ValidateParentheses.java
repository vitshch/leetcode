package com.vitalish.leetcode.season1.validateparentheses;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;

/**
 * @see https://neetcode.io/problems/validate-parentheses
 */
public class ValidateParentheses {

    private static Map<Character, Character> parentheses = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public boolean isValid(String s) {
        var stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            var symbol = s.charAt(i);
            if (parentheses.containsKey(symbol)) {
                if (!stack.isEmpty() && Objects.equals(stack.getFirst(), parentheses.get(symbol))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(symbol);
            }
        }
        return stack.isEmpty();
    }

}
