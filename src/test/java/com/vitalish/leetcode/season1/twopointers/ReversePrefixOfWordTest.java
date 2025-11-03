package com.vitalish.leetcode.season1.twopointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWordTest {

    ReversePrefixOfWord reversePrefixOfWord = new ReversePrefixOfWord();

    @ParameterizedTest
    @MethodSource("argumentSource")
    void reversePrefixOfWordTest(String input, char ch, String expected) {
        assertEquals(expected, reversePrefixOfWord.reversePrefix(input, ch));
        assertEquals(expected, reversePrefixOfWord.reversePrefix2(input, ch));
        assertEquals(expected, reversePrefixOfWord.reversePrefix3(input, ch));
    }

    private static Stream<Arguments> argumentSource() {
        return Stream.of(
                Arguments.of("abcdefd", "d", "dcbaefd"),
                Arguments.of("xyxzxe", "z", "zxyxxe"),
                Arguments.of("abcd", "z", "abcd")
        );
    }
}