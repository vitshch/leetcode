package com.vitalish.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 2390. Removing Stars From a String
 *
 * @see https://leetcode.com/problems/removing-stars-from-a-string/description/
 */
public class RemovingStarsFromString {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            var current = s.charAt(i);
            if (current == '*') {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
