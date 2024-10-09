package com.vitalish.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BaseballGameTest {

    private final BaseballGame baseballGame = new BaseballGame();

    @ParameterizedTest
    @MethodSource("arguments")
    void calculatesPoints(String[] operations, int score) {
        Assertions.assertEquals(score, baseballGame.calPoints(operations));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new String[]{"5", "2", "C", "D", "+"}, 30),
                Arguments.of(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}, 27),
                Arguments.of(new String[]{"1", "C"}, 0)
        );
    }

}