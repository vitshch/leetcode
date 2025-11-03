package com.vitalish.leetcode.season1.twopointers;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int index = 0;
        int maxLength = Integer.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();

        while (index < maxLength) {
            if (index < word1.length()) {
                result.append(word1.charAt(index));
            }
            if (index < word2.length()) {
                result.append(word2.charAt(index));
            }
            index++;
        }

        return result.toString();
    }

}
