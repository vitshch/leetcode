package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removesElement(int[] nums, int val, int[] expectedNums, int expectedK) {
        int k = removeElement.removeElement(nums, val);

        Assertions.assertEquals(expectedK, k);
        Assertions.assertArrayEquals(Arrays.copyOf(expectedNums, expectedK), Arrays.copyOf(nums, k));
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2, 3, 3}, 2),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 4, 0, 3, 0, 0, 0}, 5)
        );
    }
}