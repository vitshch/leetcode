package com.vitalish.leetcode.season1.array;

import com.vitalish.leetcode.season1.array.CanPlaceFlowers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Disabled
class CanPlaceFlowersTest {

    private final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @ParameterizedTest
    @MethodSource("arguments")
    void canPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        var result = canPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 0, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 0, 0, 0, 0, 0, 1}, 2, true),
                Arguments.of(new int[]{0,0,1,0,1}, 1, true)
        );
    }
}