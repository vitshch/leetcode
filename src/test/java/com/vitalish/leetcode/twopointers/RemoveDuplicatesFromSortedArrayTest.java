package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray =
            new RemoveDuplicatesFromSortedArray();

    @ParameterizedTest
    @MethodSource("provideParams")
    void removesDuplicates(int[] nums, int expectedLength, int[] expectedNums) {
        int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(length, expectedLength);
        Assertions.assertArrayEquals(Arrays.copyOf(expectedNums, length), Arrays.copyOf(nums, length));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4})
        );
    }

}