package com.vitalish.leetcode.stack;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences
 *
 * @see https://leetcode.com/problems/validate-stack-sequences/description/
 */
public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> log = new Stack<>();
        int i = 0;
        for (int item : pushed) {
            log.push(item);
            while (!log.isEmpty() && log.peek() == popped[i]) {
                log.pop();
                i++;
            }
        }
        return log.empty();
    }

}
