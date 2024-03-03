package com.vitalish.leetcode.anagram;

public class AnagramWithArray {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c % 26]++;
        }

        for (char c : t.toCharArray()) {
            count[c % 26]--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

}
