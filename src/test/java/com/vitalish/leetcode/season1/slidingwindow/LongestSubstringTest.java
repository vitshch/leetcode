package com.vitalish.leetcode.season1.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class LongestSubstringTest {

    private final LongestSubstring longestSubstring = new LongestSubstring();

    @ParameterizedTest
    @ArgumentsSource(TestArgumentsProvider.class)
    void findLengthOfLongestSubstring(String str, int expectedResult) {
        var actualResult = longestSubstring.lengthOfLongestSubstring(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static class TestArgumentsProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of("abcabcbb", 3),
                    Arguments.of("bbbbb", 1),
                    Arguments.of("pwwkew", 3),
                    Arguments.of(" ", 1),
                    Arguments.of("dvdf", 3),
                    Arguments.of("bbtablud", 6)
            );
        }
    }
}