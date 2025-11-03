package com.vitalish.leetcode.season1.anagram;

import com.vitalish.leetcode.season1.anagram.GroupAnagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GroupAnagramsTest {

    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @ParameterizedTest
    @ArgumentsSource(TestArguments.class)
    void groupAnagramsCorrectly(String[] strs, Set<Set<String>> expected) {
        List<List<String>> lists = groupAnagrams.groupAnagrams(strs);

        var result = lists.stream()
                .map(Set::copyOf)
                .collect(Collectors.toSet());

        Assertions.assertEquals(expected, result);
    }

    private static class TestArguments implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(
                            new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                            Set.of(Set.of("bat"), Set.of("nat", "tan"), Set.of("ate", "eat", "tea"))
                    ),
                    Arguments.of(
                            new String[]{"hhhhu", "tttti", "tttit", "hhhuh", "hhuhh", "tittt"},
                            Set.of(Set.of("tittt", "tttit", "tttti"), Set.of("hhhhu", "hhhuh", "hhuhh"))
                    ),
                    Arguments.of(
                            new String[]{"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"},
                            Set.of(
                                    Set.of("max"), Set.of("buy"), Set.of("doc"), Set.of("may"),Set.of("ill"),
                                    Set.of("duh"), Set.of("tin"), Set.of("bar"), Set.of("pew"), Set.of("cab")
                            )
                    )
            );
        }
    }
}