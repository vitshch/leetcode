package com.vitalish.leetcode.season1.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PartitionLabelsTest {

    PartitionLabels partitionLabels = new PartitionLabels();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(String s, List<String> expected) {
        Assertions.assertEquals(expected, partitionLabels.partitionLabels(s));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("ababcbacadefegdehijhklij", List.of(9, 7, 8)),
                Arguments.of("eccbbbbdec", List.of(10))
        );
    }
}