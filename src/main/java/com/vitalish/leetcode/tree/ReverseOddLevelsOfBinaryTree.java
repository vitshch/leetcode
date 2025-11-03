package com.vitalish.leetcode.tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class ReverseOddLevelsOfBinaryTree {

    // Deep First Search
    public TreeNode reverseOddLevelsDfs(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root.left, root.right, 1);
        return root;
    }

    private void dfs(TreeNode left, TreeNode right, int level) {
        if (left == null && right == null) {
            return;
        }

        if (level % 2 != 0) {
            var tmp = left.val;
            left.val = right.val;
            right.val = tmp;
        }

        dfs(left.left, left.right, level + 1);
        dfs(right.left, right.right, level + 1);
    }

    // Breath First Search
    public TreeNode reverseOddLevelsBfs(TreeNode root) {
        Queue<TreeNode> levelStack = new ArrayDeque<>();
        int level = 0;

        if (root != null) {
            levelStack.offer(root);
        }

        while (!levelStack.isEmpty()) {
            int size = levelStack.size();
            List<TreeNode> nodeList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                var current = levelStack.poll();
                nodeList.add(current);
                if (current.left != null) {
                    levelStack.offer(current.left);
                }
                if (current.right != null) {
                    levelStack.offer(current.right);
                }
            }

            if (level % 2 != 0) {
                int left = 0;
                int right = nodeList.size() - 1;

                while (left < right) {
                    var leftNode = nodeList.get(left);
                    var rightNode = nodeList.get(right);

                    int tmp = leftNode.val;
                    leftNode.val = rightNode.val;
                    rightNode.val = tmp;

                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }



}
