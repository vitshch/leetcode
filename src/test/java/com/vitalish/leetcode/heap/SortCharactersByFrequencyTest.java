package com.vitalish.leetcode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortCharactersByFrequencyTest {

    SortCharactersByFrequency solution = new SortCharactersByFrequency();

    @Test
    void testSolution() {
        assertEquals("eert", solution.frequencySort("tree"));
    }
}