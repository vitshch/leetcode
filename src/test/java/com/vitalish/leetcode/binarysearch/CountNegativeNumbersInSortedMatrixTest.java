package com.vitalish.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNegativeNumbersInSortedMatrixTest {

    CountNegativeNumbersInSortedMatrix solution = new CountNegativeNumbersInSortedMatrix();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[][] input, int expected) {
        assertEquals(expected, solution.countNegatives(input));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}, 8),
                Arguments.of(new int[][]{{3, 2}, {1, 0}}, 0)
        );
    }
}