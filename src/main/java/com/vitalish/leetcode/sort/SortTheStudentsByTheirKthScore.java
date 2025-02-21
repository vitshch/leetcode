package com.vitalish.leetcode.sort;

/**
 * 2545. Sort the Students by Their Kth Score
 * Topics: Sorting
 *
 * @see https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/
 */
public class SortTheStudentsByTheirKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 1; i < score.length; i++) {
            int j = i - 1;

            while (j >= 0 && score[j][k] < score[j + 1][k]) {
                swapSubArray(score, j, j + 1);
                j--;
            }
        }

        return score;
    }

    private void swapSubArray(int[][] sore, int l, int m) {
        int[] tmp = sore[l];
        sore[l] = sore[m];
        sore[m] = tmp;
    }

}
