package com.vitalish.leetcode.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class SearchA2DMatrixTest {

    @ParameterizedTest
    @ArgumentsSource(TestArguments.class)
    void findsTargetNumber(int[][] matrix, int target, boolean expectedResult) {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        long before = System.nanoTime();
        boolean result = searchA2DMatrix.searchMatrixBinarySearch(matrix, target);
        long after = System.nanoTime();

        System.out.println("Execution time: " + (after - before));

        Assertions.assertEquals(expectedResult, result);
    }

    private static class TestArguments implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[][]{
                            {1, 3, 5, 7},
                            {10, 11, 16, 20},
                            {23, 30, 34, 60}
                    }, 3, true),
                    Arguments.of(new int[][]{{1, 1}}, 3, false)
            );
        }
    }
}