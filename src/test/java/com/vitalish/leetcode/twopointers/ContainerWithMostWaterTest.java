package com.vitalish.leetcode.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void calculatesContainerWithMaxWater() {
        int maxArea = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assertions.assertEquals(49, maxArea);
    }
}
