package com.vitalish.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MyStackTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void testMyStack(String[] operations, Integer[][] values, Object[] expected) {
        MyStack myStack = new MyStack();
        Object[] results = new Object[operations.length];

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyStack":
                    results[i] = null;
                    break;
                case "push":
                    myStack.push(values[i][0]);
                    results[i] = null;
                    break;
                case "top":
                    results[i] = myStack.top();
                    break;
                case "pop":
                    results[i] = myStack.pop();
                    break;
                case "empty":
                    results[i] = myStack.empty();
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
                        new String[]{"MyStack", "push", "push", "top", "pop", "empty"},
                        new Integer[][]{null, {1}, {2}, null, null, null},
                        new Object[]{null, null, null, 2, 2, false}
                )
                // You can add more test cases here if needed
        );
    }

}