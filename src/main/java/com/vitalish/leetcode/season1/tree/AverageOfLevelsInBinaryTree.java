package com.vitalish.leetcode.season1.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> level = new ArrayDeque<>();
        List<Double> result = new ArrayList<>();

        if (root != null) {
            level.add(root);
        }
        double sum;
        int size;
        while (!level.isEmpty()) {
            sum = 0;
            size = level.size();
            for (int i = 0; i < size; i++) {
                var current = level.poll();
                sum += current.val;
                if (current.left != null) {
                    level.add(current.left);
                }
                if (current.right != null) {
                    level.add(current.right);
                }
            }
            result.add(sum / size);
        }
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
