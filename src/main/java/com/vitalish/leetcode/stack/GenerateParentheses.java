package com.vitalish.leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Generate Parentheses
 *
 * @see https://neetcode.io/problems/generate-parentheses
 */
// @todo review!
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        var stack = new Stack<String>();

        backtrack(0, 0, n, stack, result);
        return result;
    }

    private static void backtrack(int opened, int closed, int n, Stack<String> stack, List<String> res) {
        if (opened == closed && opened == n) {
            res.add(String.join("", stack));
            return;
        }
        if (opened < n) {
            stack.push("(");
            backtrack(opened + 1, closed, n, stack, res);
            stack.pop();
        }
        if (closed < opened) {
            stack.push(")");
            backtrack(opened, closed + 1, n, stack, res);
            stack.pop();
        }
    }

}
