package com.vitalish.leetcode.binarysearch;

import java.util.Arrays;

/**
 * 2389. Longest Subsequence With Limited Sum
 * Tags: BinarySearch
 *
 * @see https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/
 */
public class LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] result = new int[queries.length];

        // Build prefix with sums
        Arrays.sort(nums);

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Iterate over queries and search in prefix sum
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            result[i] = binarySearch(prefix, query);
        }

        return result;
    }

    private int binarySearch(int[] prefix, int query) {
        int left = 0, right = prefix.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int curr = prefix[mid];

            if (curr == query) {
                return mid + 1;
            } else if (curr < query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

}
