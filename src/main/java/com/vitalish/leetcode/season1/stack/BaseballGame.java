package com.vitalish.leetcode.season1.stack;

import java.util.ArrayDeque;

/**
 * 682. Baseball Game
 * @see https://leetcode.com/problems/baseball-game/description/
 *
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.
 */
public class BaseballGame {

    public int calPoints(String[] operations) {
        var score = new ArrayDeque<Integer>();
        for (int i = 0; i < operations.length; i++) {
            var operation = operations[i];
            switch (operation) {
                case "+" -> score.push(score.stream().limit(2).mapToInt(Integer::intValue).sum());
                case "D" -> score.push(score.peek() * 2);
                case "C" -> score.pop();
                default -> score.push(Integer.valueOf(operation));
            }
        }
        return score.stream().mapToInt(Integer::intValue).sum();
    }

}
