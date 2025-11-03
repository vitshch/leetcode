package com.vitalish.leetcode.season1.hashtable;

import com.vitalish.leetcode.season1.hashtable.NumberOfArithmeticTriplets;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfArithmeticTripletsTest {

    NumberOfArithmeticTriplets solution = new NumberOfArithmeticTriplets();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] nums, int diff, int count) {
        assertEquals(count, solution.arithmeticTriplets(nums, diff));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 4, 6, 7, 10}, 3, 2),
                Arguments.of(new int[]{4, 5, 6, 7, 8, 9}, 2, 2)
        );
    }
}