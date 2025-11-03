package com.vitalish.leetcode.season1.math;

import com.vitalish.leetcode.season1.math.GreatestCommonDivisorOfStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

    @ParameterizedTest
    @ArgumentsSource(TestArgumentProvider.class)
    void testGreatestCommonDivisorOfStrings(String str1, String str2, String expectedResult) {
        String result = greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);

        Assertions.assertEquals(expectedResult, result);
    }

    private static final class TestArgumentProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of("ABCABC", "ABC", "ABC"),
                    Arguments.of("ABABAB", "ABAB", "AB"),
                    Arguments.of("LEET", "CODE", "")
            );
        }
    }
}