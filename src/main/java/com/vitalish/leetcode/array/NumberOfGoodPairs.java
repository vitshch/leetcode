package com.vitalish.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int current : nums) {
            Integer count = frequencyMap.getOrDefault(current, 0);
            frequencyMap.put(current, ++count);
        }

        return frequencyMap.values().stream()
                .mapToInt(Integer::intValue)
                .map(e -> (e * (e - 1)) / 2)
                .sum();
    }

    public int numIdenticalPairsSeq(int[] nums) {
        int goodParisCount = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    goodParisCount++;
                }
            }
        }

        return goodParisCount;
    }

}
