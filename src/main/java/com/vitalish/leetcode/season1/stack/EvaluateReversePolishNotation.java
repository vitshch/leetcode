package com.vitalish.leetcode.season1.stack;

import java.util.Stack;

/**
 * Evaluate Reverse Polish Notation
 *
 * @see https://neetcode.io/problems/evaluate-reverse-polish-notation
 */

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String item : tokens) {
            switch (item) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    var operand2 = stack.pop();
                    var operand1 = stack.pop();
                    stack.push(operand1 - operand2);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    var operand2 = stack.pop();
                    var operand1 = stack.pop();
                    stack.push(operand1 / operand2);
                }
                default -> stack.push(Integer.valueOf(item));
            }
        }
        return stack.pop();
    }
}
