package com.vitalish.leetcode.season1.anagram;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 49. Group Anagrams
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * <p>
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * <p>
 * Input: strs = ["a"]
 * Output: [["a"]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 * <p>
 * https://leetcode.com/problems/group-anagrams/
 */

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap();
        for (var str : strs) {
            String hash = getHash(str);
            if (result.containsKey(hash)) {
                result.get(hash).add(str);
            } else {
                result.put(hash, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(result.values());
    }

    private static String getHash(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
