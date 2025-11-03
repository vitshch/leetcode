package com.vitalish.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberAfterDigitSwapsByParityTest {

    LargestNumberAfterDigitSwapsByParity solution = new LargestNumberAfterDigitSwapsByParity();

    @Test
    void testSolution() {
        assertEquals(3412, solution.largestInteger(1234));
    }
}