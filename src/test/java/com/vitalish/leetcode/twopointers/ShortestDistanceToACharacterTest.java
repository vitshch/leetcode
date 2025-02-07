package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShortestDistanceToACharacterTest {

    private ShortestDistanceToACharacter sd = new ShortestDistanceToACharacter();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String s, char symbol, int[] expected) {
        assertArrayEquals(expected, sd.shortestToChar(s, symbol));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("loveleetcode", "e", new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}),
                Arguments.of("aaab", "b", new int[]{3, 2, 1, 0})
        );
    }
}