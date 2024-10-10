package com.vitalish.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    private Integer top;
    private final Deque<Integer> stack;
    private final Deque<Integer> reversed;

    public MyQueue() {
        stack = new ArrayDeque<>();
        reversed = new ArrayDeque<>();
    }

    public void push(int x) {
        if (stack.isEmpty() && reversed.isEmpty()) {
            top = x;
        }
        stack.push(x);
    }

    public int pop() {
        if (reversed.isEmpty()) {
            while (!stack.isEmpty()) {
                reversed.push(stack.pop());
            }
        }
        var tmp = reversed.pop();
        if (reversed.isEmpty()) {
            while (!stack.isEmpty()) {
                reversed.push(stack.pop());
            }
        }
        top = reversed.peek();
        return tmp;
    }

    public int peek() {
        return top;
    }

    public boolean empty() {
        return stack.isEmpty() && reversed.isEmpty();
    }
}
