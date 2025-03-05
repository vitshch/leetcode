package com.vitalish.leetcode.hashtable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheNumberOfGoodPairsTest {

    FindTheNumberOfGoodPairs solution = new FindTheNumberOfGoodPairs();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] nums1, int[] nums2, int k, int expected) {
        assertEquals(expected, solution.numberOfPairs(nums1, nums2, k));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1, 5),
                Arguments.of(new int[]{1, 2, 4, 12}, new int[]{2, 4}, 3, 2)
        );
    }
}