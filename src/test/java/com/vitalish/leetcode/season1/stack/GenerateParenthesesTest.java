package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class GenerateParenthesesTest {

    GenerateParentheses generateParentheses = new GenerateParentheses();

    @ParameterizedTest
    @MethodSource("arguments")
    void generatesParentheses(int n, Set<String> expected) {
        Assertions.assertEquals(expected, new HashSet<>(generateParentheses.generateParenthesis(n)));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(1, Set.of("()")),
                Arguments.of(3, Set.of("((()))", "(()())", "(())()", "()(())", "()()()"))
        );
    }
}