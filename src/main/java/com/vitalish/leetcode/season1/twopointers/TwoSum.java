package com.vitalish.leetcode.season1.twopointers;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSum {

    // increase L if sum is smaller, decrease r if sum is greater
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{++left, ++right};
    }

}
