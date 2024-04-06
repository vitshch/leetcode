package com.vitalish.leetcode.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {

    private final RotateImage rotateImage = new RotateImage();

    @Test
    void rotatesImage() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expectedMatrix = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        rotateImage.rotate(matrix);

        Assertions.assertArrayEquals(expectedMatrix[0], matrix[0]);
        Assertions.assertArrayEquals(expectedMatrix[1], matrix[1]);
        Assertions.assertArrayEquals(expectedMatrix[2], matrix[2]);
    }
}