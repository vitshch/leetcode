package com.vitalish.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 1544. Make The String Great
 *
 * @see https://leetcode.com/problems/make-the-string-great/description/
 */
public class MakeTheStringGreat {

    public String makeGood(String s) {
        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            var currentSymbol = s.charAt(i);
            if (!symbols.isEmpty() && Math.abs(symbols.peek() - currentSymbol) == 32) {
                symbols.pop();
            } else {
                symbols.push(currentSymbol);
            }
        }
        return symbols.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

}
