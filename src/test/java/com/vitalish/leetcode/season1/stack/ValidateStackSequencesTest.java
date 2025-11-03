package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateStackSequencesTest {

    private final ValidateStackSequences validateStackSequences = new ValidateStackSequences();

    @ParameterizedTest
    @MethodSource("arguments")
    void validatesStackSequences(int[] pushed, int[] popped, boolean expected) {
        assertEquals(expected, validateStackSequences.validateStackSequences(pushed, popped));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}, false)
        );
    }


}