package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void twoSumTest(int[] numbers, int target, int[] expectedResult) {
        int[] result = twoSum.twoSum(numbers, target);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }
}