package com.vitalish.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void name(String parentheses, boolean expected) {
        boolean result = validParentheses.isValid(parentheses);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("){", false)
        );
    }
}