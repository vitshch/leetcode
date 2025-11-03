package com.vitalish.leetcode.season1.heap;

import com.vitalish.leetcode.season1.heap.LargestNumberAfterDigitSwapsByParity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberAfterDigitSwapsByParityTest {

    LargestNumberAfterDigitSwapsByParity solution = new LargestNumberAfterDigitSwapsByParity();

    @Test
    void testSolution() {
        assertEquals(3412, solution.largestInteger(1234));
    }
}