package com.vitalish.leetcode.season1.palindrome;

import com.vitalish.leetcode.season1.palindrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void checksPalindrome() {
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome("amanaplana,  .  ^%$#canalpanama"));
    }

    @Test
    void checksNotPalindrome() {
        Palindrome palindrome = new Palindrome();

        Assertions.assertFalse(palindrome.isPalindrome("race a car"));
    }
}