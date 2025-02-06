package com.vitalish.leetcode.twopointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 763. Partition Labels
 *
 * @see https://leetcode.com/problems/partition-labels/description/
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            last.put(ch, i);
        }

        int max = 0;
        int prev = -1;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            max = Math.max(max, last.get(ch));
            if (max == i) {
                res.add(max - prev);
                prev = max;
            }
        }

        return res;
    }

}
