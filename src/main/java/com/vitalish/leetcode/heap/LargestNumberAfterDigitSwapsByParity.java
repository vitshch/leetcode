package com.vitalish.leetcode.heap;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumberAfterDigitSwapsByParity {

    public int largestInteger(int num) {
        Comparator<Integer> valComparator = Comparator.comparingInt(Integer::intValue).reversed();

        ArrayDeque<Integer> digits = new ArrayDeque<>();
        PriorityQueue<Integer> even = new PriorityQueue<>(valComparator);
        PriorityQueue<Integer> odd = new PriorityQueue<>(valComparator);

        int divider = 10;

        while (num > 0) {
            int digit = num % divider;
            digits.push(digit);

            if (digit % 2 == 0) {
                even.add(digit);
            } else {
                odd.add(digit);
            }
            num /= divider;
        }

        int result = 0;
        while (!digits.isEmpty()) {
            int val = digits.pop() % 2 == 0
                    ? even.poll()
                    : odd.poll();

            result = result * divider + val;
        }

        return result;
    }
}
