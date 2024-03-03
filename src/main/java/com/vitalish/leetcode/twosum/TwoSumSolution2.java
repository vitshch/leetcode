package com.vitalish.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution2 {

    public static void main(String[] args) {
        var arr = new int[]{2, 7, 11, 15};
        var target = 9;
//        int[] ints = twoSum(arr, target);
        int[] ints = towSumOptimised(arr, target);

        //[0,1]
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] towSumOptimised(int[] nums, int target) {
        Map<Integer, Integer> integerIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var complement = target - nums[i];

            if (integerIndexMap.containsKey(complement)) {
                return new int[]{integerIndexMap.get(complement), i};
            }
            integerIndexMap.put(nums[i], i);
        }
        return new int[]{};
    }

}
