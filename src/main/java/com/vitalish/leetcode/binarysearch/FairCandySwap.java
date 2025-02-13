package com.vitalish.leetcode.binarysearch;

import java.util.Arrays;

/**
 * 888. Fair Candy Swap
 * Tags: BinarySearch
 *
 * @see https://leetcode.com/problems/fair-candy-swap/description/
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();

        Arrays.sort(bobSizes);

        int target = (aliceSum + bobSum) / 2;
        for (int i = 0; i < aliceSizes.length; i++) {
            int toFind = target - (aliceSum - aliceSizes[i]);
            int index = binarySearch(bobSizes, toFind);
            if (index > -1) {
                return new int[]{aliceSizes[i], bobSizes[index]};
            }
        }
        return new int[0];
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
