package com.vitalish.leetcode;

import com.vitalish.leetcode.sort.MinimumNumberGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MinimumNumberGameTest {

    MinimumNumberGame minimumNumberGame = new MinimumNumberGame();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] nums, int[] expected) {
        Assertions.assertArrayEquals(expected, minimumNumberGame.numberGame(nums));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 2, 3}, new int[]{3, 2, 5, 4}),
                Arguments.of(new int[]{2, 5}, new int[]{5, 2})
        );
    }
}