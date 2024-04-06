package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @ParameterizedTest
    @MethodSource("argumentsSource")
    void treeSumTest(int[] nums, List<List<Integer>> expected) {
        var result = threeSum.threeSum(nums);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsSource() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{-2, 0, 0, 2, 2}, List.of(List.of(-2, 0, 2)))

        );
    }
}