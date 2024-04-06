package com.vitalish.leetcode.twopointers;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int left, right, target, sum;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            left = i + 1;
            right = nums.length - 1;
            target = nums[i] * -1;

            while (left < right) {
                sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }

}
