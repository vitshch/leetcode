package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @ParameterizedTest
    @ArgumentsSource(TestArgumentsProvider.class)
    void mergesStrings(String word1, String word2, String expectedResult) {
        var result = mergeStringsAlternately.mergeAlternately(word1, word2);

        Assertions.assertEquals(expectedResult, result);
    }

    private static class TestArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of("abc", "pqr", "apbqcr"),
                    Arguments.of("ab", "pqrs", "apbqrs"),
                    Arguments.of("abcd", "pq", "apbqcd")
            );
        }
    }
}