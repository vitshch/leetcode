package com.vitalish.leetcode.hashtable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheTwoSneakyNumbersOfDigitvilleTest {

    TheTwoSneakyNumbersOfDigitville solution = new TheTwoSneakyNumbersOfDigitville();

    @ParameterizedTest
    @MethodSource("argumentsSource")
    public void testSolution(int[] nums, int[] expected) {
        Set<Integer> expectedSet = Arrays.stream(expected)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toSet());

        Set<Integer> actualSet = Arrays.stream(solution.getSneakyNumbers(nums))
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toSet());

        assertEquals(expectedSet, actualSet);
    }

    private static Stream<? extends Arguments> argumentsSource() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0}, new int[]{0, 1}),
                Arguments.of(new int[]{0, 3, 2, 1, 3, 2}, new int[]{2, 3}),
                Arguments.of(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}, new int[]{4, 5})
        );
    }
}