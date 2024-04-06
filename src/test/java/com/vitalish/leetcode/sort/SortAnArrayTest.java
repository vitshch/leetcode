package com.vitalish.leetcode.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SortAnArrayTest {

    private final SortAnArray sortAnArray = new SortAnArray();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sortAnArrayTest(int[] nums, int[] sortedNums) {
        int[] result = sortAnArray.sortArray(nums);

        Assertions.assertArrayEquals(sortedNums, result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{5, 2, 3, 1}, new int[]{1, 2, 3, 5}),
                Arguments.of(new int[]{5, 1, 1, 2, 0, 0}, new int[]{0, 0, 1, 1, 2, 5})
        );
    }
}