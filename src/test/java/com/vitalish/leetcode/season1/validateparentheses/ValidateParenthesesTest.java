package com.vitalish.leetcode.season1.validateparentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidateParenthesesTest {

    private ValidateParentheses validateParentheses;

    @ParameterizedTest
    @MethodSource("arguments")
    void validatesParentheses(String inputString, boolean result) {
        validateParentheses = new ValidateParentheses();
        Assertions.assertEquals(result, validateParentheses.isValid(inputString));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("[]", true),
                Arguments.of("([{}])", true),
                Arguments.of("[(])", false)
        );
    }


}