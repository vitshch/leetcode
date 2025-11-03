package com.vitalish.leetcode.season1.containsduplicate;

import com.vitalish.leetcode.season1.containsduplicate.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void containsDuplicateTest() {
        int[] arr = {1, 2, 3, 1};
        boolean result = containsDuplicate.containsDuplicate(arr);
        Assertions.assertTrue(result);
    }
}