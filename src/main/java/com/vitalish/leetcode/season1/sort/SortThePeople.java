package com.vitalish.leetcode.season1.sort;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 2418. Sort the People
 * Topics: Sort
 *
 * @see https://leetcode.com/problems/sort-the-people/description/
 */
public class SortThePeople {

    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 1; i < names.length; i++) {
            int j = i - 1;
            while (j >= 0 && heights[j + 1] > heights[j]) {
                int tmp = heights[j + 1];
                heights[j + 1] = heights[j];
                heights[j] = tmp;

                String tmpName = names[j + 1];
                names[j + 1] = names[j];
                names[j] = tmpName;

                j--;
            }
        }
        return names;
    }

    public String[] sortPeople1(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.comparing(Integer::intValue).reversed());

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        return map.values().toArray(String[]::new);
    }

}

