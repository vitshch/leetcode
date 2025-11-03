package com.vitalish.leetcode.season1.heap;

import com.vitalish.leetcode.season1.heap.DeleteGreatestValueInEachRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteGreatestValueInEachRowTest {


    DeleteGreatestValueInEachRow solution = new DeleteGreatestValueInEachRow();

    @Test
    void testSolution() {
        assertEquals(8, solution.deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }
}