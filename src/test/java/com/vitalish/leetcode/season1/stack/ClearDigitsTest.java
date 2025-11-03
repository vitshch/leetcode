package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClearDigitsTest {

    ClearDigits solution = new ClearDigits();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String input, String expected) {
        assertEquals(expected, solution.clearDigits(input));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("abc", "abc"),
                Arguments.of("cb34", "")
        );
    }
}