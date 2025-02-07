package com.vitalish.leetcode.twopointers;

/**
 * 821. Shortest Distance to a Character
 *
 * @see https://leetcode.com/problems/shortest-distance-to-a-character/description/
 *
 */
public class ShortestDistanceToACharacter {

    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];

        int prev = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res[i] = 0;
                prev = i;
            }
            res[i] = prev == -1 ? -1 : i - prev;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
                res[i] = 0;
            }
            var distance = Math.abs(i - prev);
            res[i] = res[i] == -1 ? distance : Math.min(res[i], distance);
        }

        return res;
    }

}
