package com.vitalish.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class IndicesOfStableMountainsTest {

    IndicesOfStableMountains indicesOfStableMountains = new IndicesOfStableMountains();

    @ParameterizedTest
    @MethodSource("arguments")
    void testIndexesOfStableMountains(int[] height, int threshold, List<Integer> expected) {
        Assertions.assertEquals(expected, indicesOfStableMountains.stableMountains(height, threshold));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, List.of(3, 4)),
                Arguments.of(new int[]{10, 1, 10, 1, 10}, 3, List.of(1, 3)),
                Arguments.of(new int[]{10, 1, 10, 1, 10}, 10, List.of())
        );
    }
}