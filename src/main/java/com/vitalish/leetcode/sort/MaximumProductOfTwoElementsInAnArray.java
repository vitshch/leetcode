package com.vitalish.leetcode.sort;

import java.util.Arrays;

/**
 * 1464. Maximum Product of Two Elements in an Array
 * Topics: Sorting
 *
 * @see https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
 *
 */
public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        return (nums[length - 1] - 1) * (nums[length - 2] - 1);
    }

}
