package com.vitalish.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class KidsWithTheGreatestNumberOfCandiesTest {

    private final KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies
            = new KidsWithTheGreatestNumberOfCandies();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void name(int[] candies, int extraCandies, List<Boolean> expectedResult) {
        var result = kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        Assertions.assertEquals(expectedResult.size(), result.size());
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)),
                Arguments.arguments(new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)),
                Arguments.arguments(new int[]{12, 1, 12}, 10, List.of(true, false, true))
        );
    }

}