package com.vitalish.leetcode.season1.array;

/**
 * 1314. Matrix Block Sum
 * Topic: Array, Matrix, Prefix Sum
 *
 * @see https://leetcode.com/problems/matrix-block-sum/description/
 */
public class MatrixBlockSum {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] answer = new int[mat.length][mat[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = sum(mat, i, j, k);
            }
        }

        return answer;
    }

    private static int sum(int[][] mat, int i, int j, int k) {
        int sum = 0;

        int rLeft = Math.max(i - k, 0);
        int rRight = Math.min(i + k, mat.length - 1);

        int cLeft = Math.max(j - k, 0);
        int cRight = Math.min(j + k, mat[0].length - 1);

        for (int r = rLeft; r <= rRight; r++) {
            for (int c = cLeft; c <= cRight; c++) {
                sum += mat[r][c];
            }
        }

        return sum;
    }

}
