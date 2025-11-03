package com.vitalish.leetcode.season1.stack;

import java.util.Stack;

public class MinStackWithInternalStack {

    private Stack<Integer> top;
    private Stack<Integer> min;

    public MinStackWithInternalStack() {
        top = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        top.push(val);
        min.push(Math.min(min.isEmpty() ? val : min.peek(), val));
    }

    public void pop() {
        top.pop();
        min.pop();
    }

    public int top() {
        return top.peek();
    }

    public int getMin() {
        return min.peek();
    }

}
