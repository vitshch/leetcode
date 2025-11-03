package com.vitalish.leetcode.array;

public class Test {

    public int countGoodSubstrings(String s) {
        int count = 0;
        int l = 0, r = 3;

        while (r <= s.length()) {
            char[] charArray = s.substring(l, r).toCharArray();

            if (charArray[0] != charArray[1] && charArray[1] != charArray[2] && charArray[2] != charArray[3]) {
                count++;
            }

            l++;
            r++;
        }


        return count;
    }

}
