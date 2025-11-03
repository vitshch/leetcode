package com.vitalish.leetcode.season1.stack;

import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    private final Map<Character, Character> parenthesesMap = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
    );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if (isOpenBracket(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                var item = stack.peek();
                if (current.equals(getClosingBracket(item))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenBracket(Character bracket) {
        return parenthesesMap.containsKey(bracket);
    }

    private Character getClosingBracket(Character bracket) {
        return parenthesesMap.get(bracket);
    }

}
