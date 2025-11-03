package com.vitalish.leetcode.season1.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        var freqMap = new HashMap<Character, Integer>();
        var pq = new PriorityQueue<Map.Entry<Character, Integer>>(
                (a,b) -> b.getValue() - a.getValue()
        );

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        pq.addAll(freqMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            var entry = pq.poll();

            sb.repeat(entry.getKey(), entry.getValue());
        }

        return sb.toString();
    }

}
