package com.vitalish.leetcode.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TheKWeakestRowsInAMatrixTest {

    TheKWeakestRowsInAMatrix solution = new TheKWeakestRowsInAMatrix();

    @ParameterizedTest
    @MethodSource("arguments")
    void name(int[][] matrix, int k, int[] expected) {
        assertArrayEquals(expected, solution.kWeakestRows(matrix, k));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 0},
                                {1, 0, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 1}
                        },
                        3,
                        new int[]{2, 0, 3}
                ),
                Arguments.of(
                        new int[][]{
                                {1, 0, 0, 0},
                                {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 0, 0, 0}
                        },
                        2,
                        new int[]{0, 2}
                )
        );
    }

}