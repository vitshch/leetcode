package com.vitalish.leetcode.backtracking;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 17. Letter Combinations of a Phone Number
 * <p>
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 * <p>
 * Input: digits = ""
 * Output: []
 * Example 3:
 * <p>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * <p>
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

public class LetterCombinations {

    private static final Map<Integer, String> KEYBOARD = Map.of(
            2, "abc",
            3, "def",
            4, "ghi",
            5, "jkl",
            6, "mno",
            7, "pqrs",
            8, "tuv",
            9, "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isBlank()) {
            return Collections.emptyList();
        }
        List<String> combinations = new ArrayList<>();
        List<String> path = new ArrayList<>();
        List<Integer> digitList = convertStringDigits(digits);

        backtrack(0, path, digitList, combinations);
        return combinations;
    }

    private void backtrack(int index, List<String> path, List<Integer> digits, List<String> combinations) {
        if (path.size() == digits.size()) {
            combinations.add(String.join("", path));
            return;
        }
        var digit = digits.get(index);
        String digitLetters = KEYBOARD.get(digit);
        for (int i = 0; i < digitLetters.length(); i++) {
            var letter = String.valueOf(digitLetters.charAt(i));
            path.add(letter);
            backtrack(index + 1, path, digits, combinations);
            path.remove(letter);
        }
    }

    private static List<Integer> convertStringDigits(String digits) {
        return Arrays.stream(digits.split("")).sequential()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

}
