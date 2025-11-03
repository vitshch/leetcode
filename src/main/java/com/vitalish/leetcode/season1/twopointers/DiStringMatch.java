package com.vitalish.leetcode.season1.twopointers;

/**
 * 942. DI String Match
 *
 * @see https://leetcode.com/problems/di-string-match/description/
 */
public class DiStringMatch {

    public int[] diStringMatch(String s) {
        int size = s.length();
        int low = 0, hi = size;

        int[] result = new int[size + 1];
        for (int i = 0; i < size; ++i) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = hi--;
            }
        }

        result[size] = low;
        return result;
    }

}
