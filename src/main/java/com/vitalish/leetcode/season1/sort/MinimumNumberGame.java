package com.vitalish.leetcode.season1.sort;

import java.util.Arrays;

/**
 * 2974. Minimum Number Game
 *
 * @see https://leetcode.com/problems/minimum-number-game/description/
 *
 */

public class MinimumNumberGame {

    public int[] numberGame(int[] nums) {
        var res = new int[nums.length];

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i = i + 2) {
            res[i] = nums[i + 1];
            res[i + 1] = nums[i];
        }
        return res;
    }

}
