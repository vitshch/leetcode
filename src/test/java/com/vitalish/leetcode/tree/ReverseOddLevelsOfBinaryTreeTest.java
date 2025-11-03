package com.vitalish.leetcode.tree;

import org.junit.jupiter.api.Test;

class ReverseOddLevelsOfBinaryTreeTest {


    @Test
    void testSolution() {
        ReverseOddLevelsOfBinaryTree sol = new ReverseOddLevelsOfBinaryTree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(13);

        root.right = new TreeNode(5);
        root.right.left = new TreeNode(21);
        root.right.right = new TreeNode(34);

//        sol.reverseOddLevelsDfs(root);
        sol.reverseOddLevelsBfs(root);
    }
}