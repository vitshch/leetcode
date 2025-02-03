package com.vitalish.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class IndicesOfStableMountains {

    public List<Integer> stableMountains(int[] height, int threshold) {
        var result = new ArrayList<Integer>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                result.add(i);
            }
        }
        return result;
    }

}
