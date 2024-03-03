package com.vitalish.leetcode.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

    private final Anagram anagram = new Anagram();
    private final AnagramWithArray anagramWithArray = new AnagramWithArray();

    @Test
    void validAnagram() {
        assertTrue(anagram.isAnagram("abc", "bca"));
        assertTrue(anagramWithArray.isAnagram("abc", "bca"));
    }

    @Test
    void inValidAnagramByLength() {
        assertFalse(anagram.isAnagram("abc", "zsdf"));
        assertFalse(anagramWithArray.isAnagram("abc", "zsdf"));
    }

    @Test
    void inValidAnagramByContent() {
        assertFalse(anagram.isAnagram("abc", "zsd"));
        assertFalse(anagramWithArray.isAnagram("abc", "zsd"));
    }
}