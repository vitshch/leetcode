package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MyQueueTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void testMyQueue(String[] operations, Integer[] values, Object[] expected) {
        MyQueue myQueue = new MyQueue();
        Object[] results = new Object[operations.length];

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyQueue":
                    results[i] = null;
                    break;
                case "push":
                    myQueue.push(values[i]);
                    results[i] = null;
                    break;
                case "peek":
                    results[i] = myQueue.peek();
                    break;
                case "pop":
                    results[i] = myQueue.pop();
                    break;
                case "empty":
                    results[i] = myQueue.empty();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operations[i]);
            }
        }

        Assertions.assertArrayEquals(expected, results);
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(
                        new String[]{"MyQueue", "push", "push", "peek", "pop", "empty"},
                        new Integer[]{null, 1, 2, null, null, null},
                        new Object[]{null, null, null, 1, 1, false}
                ),
                Arguments.of(
                        new String[]{"MyQueue", "push", "push", "push", "push", "pop", "push", "pop", "pop", "pop", "pop"},
                        new Integer[]{null, 1, 2, 3, 4, null, 5, null, null, null, null},
                        new Object[]{null, null, null, null, null, 1, null, 2, 3, 4, 5}
                ),
                Arguments.of(
                        new String[]{"MyQueue", "push", "push", "pop", "push", "push", "pop", "peek"},
                        new Integer[]{null, 1, 2, null, 3, 4, null, null},
                        new Object[]{null, null, null, 1, null, null, 2, 3}
                )
        );
    }

}