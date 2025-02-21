package com.vitalish.leetcode.sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductOfTwoElementsInAnArrayTest {

    MaximumProductOfTwoElementsInAnArray solution = new MaximumProductOfTwoElementsInAnArray();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] nums, int expected) {
        assertEquals(expected, solution.maxProduct(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 2}, 12),
                Arguments.of(new int[]{1, 5, 4, 5}, 16)
        );
    }
}