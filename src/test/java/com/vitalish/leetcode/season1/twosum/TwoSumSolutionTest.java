package com.vitalish.leetcode.season1.twosum;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumSolutionTest {

    private final TwoSumSolution twoSumSolution = new TwoSumSolution();

    @ArgumentsSource(TestArguments.class)
    @ParameterizedTest
    void testTwoSum(int[] nums, int target, int[] expected) {
        int[] result = twoSumSolution.twoSum(nums, target);

        assertEquals(2, result.length);
        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @ArgumentsSource(TestArguments.class)
    void testTwoSumOptimised(int[] nums, int target, int[] expected) {
        int[] result = twoSumSolution.twoSumOptimised(nums, target);

        assertEquals(2, result.length);
        assertArrayEquals(expected, result);
    }

    private static class TestArguments implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                    Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2})
            );
        }
    }
}