package com.vitalish.leetcode.season1.heap;

import com.vitalish.leetcode.season1.heap.SortCharactersByFrequency;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortCharactersByFrequencyTest {

    SortCharactersByFrequency solution = new SortCharactersByFrequency();

    @Test
    void testSolution() {
        assertEquals("eert", solution.frequencySort("tree"));
    }
}