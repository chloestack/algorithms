package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;

/**
 * Question 101.
 *
 */
public class IsSymmetric {

    private boolean verify(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        } else if (left == null && right != null) {
            return false;
        } else if (right == null && left != null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        if(!verify(left.left, right.right)) {
            return false;
        }

        if(!verify(left.right, right.left)) {
            return false;
        }

        return true;
    }

    public boolean isSymmetric(TreeNode root ) {

        if (root == null) {
            return true;
        }

        return verify(root.left, root.right);
    }

}
