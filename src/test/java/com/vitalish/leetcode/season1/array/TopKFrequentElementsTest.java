package com.vitalish.leetcode.season1.array;

import com.vitalish.leetcode.season1.array.TopKFrequentElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Disabled
class TopKFrequentElementsTest {

    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @ParameterizedTest
    @MethodSource(value = "arguments")
    void returnsTopKFrequentElements(int[] arr, int k, int[] expectedArr) {
        int[] result = topKFrequentElements.topKFrequent(arr, k);

        Assertions.assertArrayEquals(expectedArr, result);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}),
                Arguments.of(new int[]{4, 1, -1, 2, -1, 2, 3}, 2, new int[]{2, -1})
        );
    }
}