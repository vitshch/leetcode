package com.vitalish.leetcode.twopointers;

import java.util.ArrayDeque;

/**
 * 2000. Reverse Prefix of Word
 *
 * @see https://leetcode.com/problems/reverse-prefix-of-word/description/
 *
 * Tag: two-pointers
 */
public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        var str = word.substring(0, index + 1);
        var str2 = word.substring(index + 1);

        var result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        result.append(str2);

        return result.toString();
    }

    // Using Stack
    public String reversePrefix2(String word, char ch) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        var result = new StringBuilder();

        int i = 0;
        while (i < word.length()) {
            stack.push(word.charAt(i));
            if (word.charAt(i) == ch) {
                break;
            }
            i++;
        }

        if (stack.size() == word.length()) {
            return word;
        }

        while (stack.size() > 0) {
            result.append(stack.pop());
        }
        result.append(word.substring(i + 1));
        return result.toString();
    }

    // Using Two Pointers
    public String reversePrefix3(String word, char ch) {
        char[] chars = word.toCharArray();

        int left = 0;
        int right = 0;

        while (right < chars.length) {
            if (chars[right] == ch) {
                reverse(left, right, chars);
                break;
            }
            right++;
        }
        return String.valueOf(chars);
    }

    private static void reverse(int left, int right, char[] chars) {
        while (left < right) {
            var tmp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = tmp;
        }
    }
}
