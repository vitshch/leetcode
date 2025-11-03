package com.vitalish.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                TreeNode tmp = current.left;
                current.left = current.right;
                current.right = tmp;
            }
        }

        return root;
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
