package com.vitalish.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrawlerLogFolderTest {

    CrawlerLogFolder solution = new CrawlerLogFolder();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String[] logs, int expected) {
        assertEquals(expected, solution.minOperations(logs));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new String[]{"d1/", "d2/", "../", "d21/", "./"}, 2),
                Arguments.of(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}, 3),
                Arguments.of(new String[]{"d1/", "d2/", "../", "d21/", "./"}, 2),
                Arguments.of(new String[]{"./", "../", "./"}, 0)

        );
    }
}