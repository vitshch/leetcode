package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void isValidPalindrome(String s, boolean expectedIsPalindrome) {
        Assertions.assertEquals(expectedIsPalindrome, validPalindrome.isPalindrome(s));
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(".,", true),
                Arguments.of("0P", false)
        );
    }
}