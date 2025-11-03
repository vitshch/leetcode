package com.vitalish.leetcode.season1.array;

import com.vitalish.leetcode.season1.array.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @MethodSource("argumentSource")
    void testBestTimeToBuyAndSell(int[] prises, int expected) {
        Assertions.assertEquals(expected, bestTimeToBuyAndSellStock.maxProfit(prises));
    }

    public static Stream<Arguments> argumentSource() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }
}