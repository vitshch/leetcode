package com.vitalish.leetcode.season1.stack;

/**
 * Minimum Stack
 *
 * @see https://neetcode.io/problems/minimum-stack
 */
public class MinStack {

    private Node<Integer> top;
    private Node<Integer> min;

    public MinStack() {

    }

    public void push(int val) {
        min = new Node<>(Math.min(val, min != null ? min.value : val), min);
        top = new Node<>(val, top);
    }

    public void pop() {
        min = min.next;
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return min.value;
    }

    private record Node<Integer>(
            Integer value,
            Node<Integer> next
    ) {
        private Node(Integer value) {
            this(value, null);
        }
    }

}
