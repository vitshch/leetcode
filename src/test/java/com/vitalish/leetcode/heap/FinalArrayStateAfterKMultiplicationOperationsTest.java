package com.vitalish.leetcode.heap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FinalArrayStateAfterKMultiplicationOperationsTest {

    FinalArrayStateAfterKMultiplicationOperations solution = new FinalArrayStateAfterKMultiplicationOperations();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] nums, int k, int multiplier, int[] expected) {
        assertArrayEquals(expected, solution.getFinalState(nums, k, multiplier));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 5, 6}, 5, 2, new int[]{8, 4, 6, 5, 6}),
                Arguments.of(new int[]{1, 2}, 3, 4, new int[]{16, 8})
        );
    }

}