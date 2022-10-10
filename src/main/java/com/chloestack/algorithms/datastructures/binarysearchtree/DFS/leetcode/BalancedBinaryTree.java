package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;


/**
 * Leet 110. Balanced Binary Tree
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isDiffOneHeight(root, 0) == -1 ? false : true;
    }

    private int isDiffOneHeight(TreeNode child, int depth) {

        if (child == null) {
            return depth;
        }

        int l = isDiffOneHeight(child.left, depth + 1 );
        int r = isDiffOneHeight(child.right, depth + 1 );

        if (r == -1 || l == -1) {
            return -1;
        } else if ((r-l == 1) || (r-l == -1) || (r - l == 0)) {
            return r > l ? r : l;
        } else {
            return -1;
        }

    }

}
