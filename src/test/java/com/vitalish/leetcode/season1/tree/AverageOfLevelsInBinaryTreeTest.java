package com.vitalish.leetcode.season1.tree;

import org.junit.jupiter.api.Test;

import java.util.List;

class AverageOfLevelsInBinaryTreeTest {

    @Test
    void testSolution() {
        AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();

        AverageOfLevelsInBinaryTree.TreeNode root = new AverageOfLevelsInBinaryTree.TreeNode(3);
        root.left = new AverageOfLevelsInBinaryTree.TreeNode(9);
        root.right = new AverageOfLevelsInBinaryTree.TreeNode(20);
        root.right.right = new AverageOfLevelsInBinaryTree.TreeNode(7);
        root.right.left = new AverageOfLevelsInBinaryTree.TreeNode(15);

        List<Double> doubles = solution.averageOfLevels(root);
        System.out.println(doubles);
    }
}