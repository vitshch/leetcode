package com.vitalish.leetcode.season1.concatenationofarray;

import com.vitalish.leetcode.season1.concatenationofarray.ConcatenationOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcatenationOfArrayTest {

    private final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

    @Test
    void concatenatesArray() {
        int[] arr = {1, 2, 1};
        int[] expectedArr = {1, 2, 1, 1, 2, 1};

        int[] concatenation = concatenationOfArray.getConcatenation(arr);

        Assertions.assertArrayEquals(expectedArr, concatenation);
    }
}