package com.vitalish.leetcode.season1.heap;

import java.util.*;

public class DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        int nLength = grid.length;
        int mLength = grid[0].length;

        for (int i = 0; i < nLength; i++) {
            Arrays.sort(grid[i]);
        }

        int k = mLength - 1;
        for (int j = 0; j < mLength; j++) {
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[k]);
            }
            k--;
            result += max;
        }

        return result;
    }

}
