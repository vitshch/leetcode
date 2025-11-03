package com.vitalish.leetcode.season1.sort;

import java.util.Arrays;

public class SortAnArray {

    public int[] sortArray(int[] nums) {
        int size = nums.length;
        if (size <= 1) {
            return nums;
        }

        int halfSize = size / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, halfSize));
        int[] right = sortArray(Arrays.copyOfRange(nums, halfSize, size));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[i + j] = left[i];
                i++;
            } else {
                result[i + j] = right[j];
                j++;
            }
        }

        System.arraycopy(left, i, result, i + j, left.length - i);
        System.arraycopy(right, j, result, i + j, right.length - j);

        return result;
    }

}
