package com.vitalish.leetcode.season1.palindrome;

public class Palindrome {

    // @todo rewrite into two pointer solution(without regex)
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]+", "");
        int mid = str.length() / 2;
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
