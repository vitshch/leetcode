package com.vitalish.leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 3264. Final Array State After K Multiplication Operations I
 * Topics: Heap
 *
 * @see https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
 */

public class FinalArrayStateAfterKMultiplicationOperations {

    private static final Comparator<int[]> VALUE_COMPARATOR =
            (a, b) -> a[1] - b[1] == 0
                    ? a[0] - b[0]
                    : a[1] - b[1];

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(VALUE_COMPARATOR);

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{i, nums[i]});
        }

        for (int i = 0; i < k; i++) {
            int[] min = pq.poll();

            int val = min[1] * multiplier;
            min[1] = val;
            nums[min[0]] = val;

            pq.offer(min);
        }

        return nums;
    }

}
