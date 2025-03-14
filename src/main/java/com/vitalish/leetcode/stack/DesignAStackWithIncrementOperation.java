package com.vitalish.leetcode.stack;

/**
 * 1381. Design a Stack With Increment Operation
 * Topic: Stack
 *
 * @see https://leetcode.com/problems/design-a-stack-with-increment-operation/description/
 */
public class DesignAStackWithIncrementOperation {

    public static class CustomStack {

        private int size;
        private int maxSize;

        private int[] elements;
        private int top = -1;

        public CustomStack(int maxSize) {
            this.maxSize = maxSize;
            this.elements = new int[maxSize];
        }

        public void push(int x) {
            if (size == maxSize) {
                return;
            }
            size++;
            elements[++top] = x;
        }

        public int pop() {
            if (size == 0) {
                return -1;
            }
            int element = elements[top];
            elements[top] = 0;
            top--;
            size--;
            return element;
        }

        public void increment(int k, int val) {
            for (int i = 0; i < k && i < elements.length; i++) {
                elements[i] += val;
            }
        }
    }

}
