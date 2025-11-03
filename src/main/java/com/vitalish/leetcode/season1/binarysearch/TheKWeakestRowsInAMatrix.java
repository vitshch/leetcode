package com.vitalish.leetcode.season1.binarysearch;

import java.util.*;

/**
 * 1337. The K Weakest Rows in a Matrix
 * Tags: BinarySearch
 *
 * @see https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/
 */
public class TheKWeakestRowsInAMatrix {

    private static final Comparator<int[]> comparator =
            (a, b) ->
                    a[0] == b[0]
                            ? Integer.compare(a[1], b[1]) // compare indexes
                            : Integer.compare(a[0], b[0]); // compare sizes

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> sizes = new PriorityQueue<>(comparator);

        for (int i = 0; i < mat.length; i++) {
            int count = countSoldiers(mat[i]);
            sizes.offer(new int[]{count, i});
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = sizes.poll()[1];
        }
        return res;
    }

    private static int countSoldiers(int[] row) {
        int left = 0, right = row.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int[] kWeakestRows1(int[][] mat, int k) {
        List<int[]> sizes = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int count = Arrays.stream(mat[i])
                    .filter(num -> num == 1)
                    .sum();
            sizes.add(new int[]{count, i});
        }

        return sizes.stream()
                .sorted(Comparator.comparingInt(a -> a[0]))
                .map(item -> item[1])
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
