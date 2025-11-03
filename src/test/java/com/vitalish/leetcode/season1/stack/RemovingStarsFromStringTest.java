package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovingStarsFromStringTest {

    RemovingStarsFromString removingStarsFromString = new RemovingStarsFromString();

    @ParameterizedTest
    @MethodSource("arguments")
    void removesStarsFromString(String input, String expected) {
        assertEquals(expected, removingStarsFromString.removeStars(input));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("leet**cod*e", "lecoe"),
                Arguments.of("erase*****", "")
        );
    }
}