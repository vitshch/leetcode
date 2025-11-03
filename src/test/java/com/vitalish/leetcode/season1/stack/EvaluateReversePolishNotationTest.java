package com.vitalish.leetcode.season1.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void checksRpn() {
        var evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        String[] tokens = {"1","2","+","3","*","4","-"};

        assertEquals(5, evaluateReversePolishNotation.evalRPN(tokens));
    }
}