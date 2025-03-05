package com.vitalish.leetcode.hashtable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaximumNumberOfStringPairsTest {

    FindMaximumNumberOfStringPairs solution = new FindMaximumNumberOfStringPairs();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String[] words, int expected) {
        assertEquals(expected, solution.maximumNumberOfStringPairs(words));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new String[]{"cd", "ac", "dc", "ca", "zz"}, 2),
                Arguments.of(new String[]{"ab", "ba", "cc"}, 1),
                Arguments.of(new String[]{"aa", "ab"}, 0),
                Arguments.of(new String[]{"xi","nw","qp","to","oo","xp","ix","wn","pq"}, 3)

        );
    }
}