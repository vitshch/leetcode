package com.vitalish.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void checksMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);

        Assertions.assertEquals(0, minStack.getMin()); // return 0

        minStack.pop();
        Assertions.assertEquals(2, minStack.top());    // return 2
        Assertions.assertEquals(1, minStack.getMin()); // return 1
    }

    @Test
    void checksMinStackWithInternalStack() {
        MinStackWithInternalStack minStack = new MinStackWithInternalStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);

        Assertions.assertEquals(0, minStack.getMin()); // return 0

        minStack.pop();
        Assertions.assertEquals(2, minStack.top());    // return 2
        Assertions.assertEquals(1, minStack.getMin()); // return 1
    }
}