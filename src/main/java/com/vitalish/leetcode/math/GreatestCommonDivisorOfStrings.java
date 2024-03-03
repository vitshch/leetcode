package com.vitalish.leetcode.math;

import java.util.Objects;

/**
 * 1071. Greatest Common Divisor of Strings
 * Easy
 * Topics
 * Companies
 * Hint
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * <p>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= str1.length, str2.length <= 1000
 * str1 and str2 consist of English uppercase letters.
 * <p>
 * <p>
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
 */

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!Objects.equals(str1 + str2, str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int length1, int length2) {
        if (length2 == 0) {
            return length1;
        }
        return gcd(length2, length1 % length2);
    }
}
