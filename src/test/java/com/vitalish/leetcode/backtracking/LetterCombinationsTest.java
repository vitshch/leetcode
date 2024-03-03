package com.vitalish.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class LetterCombinationsTest {

    LetterCombinations letterCombinations = new LetterCombinations();

    @ParameterizedTest
    @ArgumentsSource(TestArgumentProvider.class)
    void letterCombinationsTest(String digits, Set<String> expectedCombinations) {
        var actualCombinations = letterCombinations.letterCombinations(digits);

        Assertions.assertEquals(expectedCombinations.size(), actualCombinations.size());
        Assertions.assertEquals(expectedCombinations, new HashSet<>(actualCombinations));
    }

    private static final class TestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of("23", Set.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                    Arguments.of("999", Set.of("www", "wwx", "wwy", "wwz", "wxw", "wxx", "wxy", "wxz", "wyw", "wyx",
                            "wyy", "wyz", "wzw", "wzx", "wzy", "wzz", "xww", "xwx", "xwy", "xwz", "xxw", "xxx", "xxy", "xxz",
                            "xyw", "xyx", "xyy", "xyz", "xzw", "xzx", "xzy", "xzz", "yww", "ywx", "ywy", "ywz", "yxw", "yxx",
                            "yxy", "yxz", "yyw", "yyx", "yyy", "yyz", "yzw", "yzx", "yzy", "yzz", "zww", "zwx", "zwy", "zwz",
                            "zxw", "zxx", "zxy", "zxz", "zyw", "zyx", "zyy", "zyz", "zzw", "zzx", "zzy", "zzz")
                    )
            );
        }
    }
}