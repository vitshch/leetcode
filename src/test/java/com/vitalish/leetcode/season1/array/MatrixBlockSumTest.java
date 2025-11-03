package com.vitalish.leetcode.season1.array;

import com.vitalish.leetcode.season1.array.MatrixBlockSum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixBlockSumTest {

    private MatrixBlockSum matrixBlockSum = new MatrixBlockSum();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[][] mat, int k, int[][] expected) {
        assertArrayEquals(expected, matrixBlockSum.matrixBlockSum(mat, k));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        1,
                        new int[][]{
                                {12, 21, 16},
                                {27, 45, 33},
                                {24, 39, 28}
                        }
                )
        );
    }
}