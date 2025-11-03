package com.vitalish.leetcode.season1.search;

/**
 * 74. Search a 2D Matrix
 * <p>
 * You are given an m x n integer matrix matrix with the following two properties:
 * <p>
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * <p>
 * You must write a solution in O(log(m * n)) time complexity.
 * <p>
 * * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/description/">Two Sum Task</a>
 */
public class SearchA2DMatrix {

    public boolean searchMatrixBinarySearch(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        int i, j, middle;

        while (low <= high) {
            middle = low + (high - low) / 2;
            i = middle / n;
            j = middle % n;

            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;

        for (int[] arr : matrix) {
            if (target >= arr[0] && target <= arr[m - 1]) {
                if (target == arr[0] || target == arr[m - 1]) {
                    return true;
                }
                for (int j = 0; j < m; j++) {
                    if (arr[j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
