package com.vitalish.leetcode.season1.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LexicographicallySmallestPalindromeTest {

    LexicographicallySmallestPalindrome solution = new LexicographicallySmallestPalindrome();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String input, String expected) {
        assertEquals(expected, solution.makeSmallestPalindrome(input));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("egcfe", "efcfe"),
                Arguments.of("abcd", "abba"),
                Arguments.of("seven", "neven")
        );
    }
}