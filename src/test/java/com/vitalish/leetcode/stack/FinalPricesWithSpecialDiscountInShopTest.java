package com.vitalish.leetcode.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FinalPricesWithSpecialDiscountInShopTest {

    FinalPricesWithSpecialDiscountInShop solution = new FinalPricesWithSpecialDiscountInShop();

    @ParameterizedTest
    @MethodSource("arguments")
    void testSolution(int[] prices, int[] expected) {
        assertArrayEquals(expected, solution.finalPrices(prices));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{8, 4, 6, 2, 3}, new int[]{4, 2, 4, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5})
        );
    }
}