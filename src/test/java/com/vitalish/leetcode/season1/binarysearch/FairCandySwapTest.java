package com.vitalish.leetcode.season1.binarysearch;

import com.vitalish.leetcode.season1.binarysearch.FairCandySwap;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FairCandySwapTest {

    FairCandySwap solution = new FairCandySwap();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] alise, int[] bob, int[] expected) {
        assertArrayEquals(expected, solution.fairCandySwap(alise, bob));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 1}, new int[]{2, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2}, new int[]{2, 3}, new int[]{1, 2}),
                Arguments.of(new int[]{2}, new int[]{1, 3}, new int[]{2, 3}),
                Arguments.of(new int[]{1, 2, 5}, new int[]{2, 4}, new int[]{5, 4})
        );
    }
}