package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeTheStringGreatTest {

    private static final MakeTheStringGreat makeTheStringGreat = new MakeTheStringGreat();

    @ParameterizedTest
    @MethodSource("arguments")
    void makesTheStringGreat(String input, String expected) {
        assertEquals(expected, makeTheStringGreat.makeGood(input));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("aAbBcc", "cc"),
                Arguments.of("leEeetcode", "leetcode"),
                Arguments.of("abBAcC", ""),
                Arguments.of("s", "s")
        );
    }

}