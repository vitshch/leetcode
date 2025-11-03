package com.vitalish.leetcode.season1.stack;

import com.vitalish.leetcode.season1.stack.DesignAStackWithIncrementOperation.CustomStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DesignAStackWithIncrementOperationTest {

    @Test
    void testSolution() {
        CustomStack stk = new CustomStack(3);
        stk.push(1);
        stk.push(2);
        assertEquals(2, stk.pop());
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.increment(5, 100);
        stk.increment(2, 100);
        assertEquals(103, stk.pop());
        assertEquals(202, stk.pop());
        assertEquals(201, stk.pop());
        stk.pop();
        stk.pop();
        assertEquals(-1, stk.pop());
    }
}