package com.vitalish.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AsteroidCollisionTest {

    private AsteroidCollision asteroidCollision = new AsteroidCollision();

    @ParameterizedTest
    @MethodSource("arguments")
    void asteroidCollisionTest(int[] asteroids, int[] expected) {
        Assertions.assertArrayEquals(expected, asteroidCollision.asteroidCollision(asteroids));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{5, 10, -5}, new int[]{5, 10}),
                Arguments.of(new int[]{8, -8}, new int[]{}),
                Arguments.of(new int[]{10, 2, -5}, new int[]{10}),
                Arguments.of(new int[]{-2,-1,1,2}, new int[]{-2,-1,1,2})
        );
    }

}