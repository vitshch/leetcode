package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveOutermostParenthesesTest {

    RemoveOutermostParentheses solution = new RemoveOutermostParentheses();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String s, String expected) {
        assertEquals(expected, solution.removeOuterParentheses(s));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("(()())(())", "()()()"),
                Arguments.of("(()())(())(()(()))", "()()()()(())"),
                Arguments.of("()()", ""),
                Arguments.of("()()()()(())", "()")
        );
    }
}