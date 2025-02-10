package com.vitalish.leetcode.binarysearch;

/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 *
 * @see https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
 */
public class CountNegativeNumbersInSortedMatrix {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            count += binarySearch(grid[i]);
        }
        return count;
    }

    private static int binarySearch(int[] arr) {
        int count = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] < 0) {
                count += right - mid + 1;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return count;
    }

}
