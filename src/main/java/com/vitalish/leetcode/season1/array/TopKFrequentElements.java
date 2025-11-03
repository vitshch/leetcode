package com.vitalish.leetcode.season1.array;

import java.util.*;

/**
 * 347. Top K Frequent Elements
 * Medium
 * Topics
 * Companies
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 * <p>
 * <p>
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * <p>
 * https://leetcode.com/problems/top-k-frequent-elements/
 */

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // The first step is to build a hash map element -> its frequency
        Map<Integer, Integer> numsFreqMap = new HashMap<>();
        for (int num : nums) {
            numsFreqMap.put(num, numsFreqMap.getOrDefault(num, 0) + 1);
        }

        // The second step is to build a heap of size k using N elements.
        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(numsFreqMap::get));
        for(Integer num : numsFreqMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] topKFrequentNotOptimal(int[] nums, int k) {
        Map<Integer, Integer> numsFreqMap = new HashMap<>();

        for (int num : nums) {
            Integer count = numsFreqMap.getOrDefault(num, 0);
            numsFreqMap.put(num, ++count);
        }

        var list = numsFreqMap.entrySet().stream()
                .map(entry -> new Pair(entry.getKey(), entry.getValue()))
                .toList();

        return list.stream()
                .sorted()
                .limit(k)
                .mapToInt(pair -> pair.value)
                .toArray();
    }

    private static class Pair implements Comparable<Pair> {
        Integer count;
        Integer value;

        public Pair(Integer value, Integer count) {
            this.count = count;
            this.value = value;
        }

        @Override
        public int compareTo(Pair p) {
            return p.count - this.count;
        }
    }

}
