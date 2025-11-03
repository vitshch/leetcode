package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    private final DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @ParameterizedTest
    @MethodSource("arguments")
    void calcDailyTemperatures(int[] temperatures, int[] expectedResult) {
        assertArrayEquals(expectedResult, dailyTemperatures.dailyTemperatures(temperatures));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void calcDailyTemperatures2(int[] temperatures, int[] expectedResult) {
        assertArrayEquals(expectedResult, dailyTemperatures.dailyTemperatures2(temperatures));
    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{30, 38, 30, 36, 35, 40, 28}, new int[]{1, 4, 1, 2, 1, 0, 0}),
                Arguments.of(new int[]{22, 21, 20}, new int[]{0, 0, 0})
        );
    }
}