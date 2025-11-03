package com.vitalish.leetcode.season1.twopointers;

/**
 * 11. Container With Most Water
 * <p>
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int area = Integer.min(leftHeight, rightHeight) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
