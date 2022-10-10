package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

/**
 * Question 100.
 *  checking two binary trees are same or not
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return verify(p, q);
    }

    private boolean verify(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if(!verify(p.left, q.left)) {
            return false;
        }

        if ( p.val != q.val ) {
            return false;
        }

        if (!verify(p.right, q.right)) {
            return false;
        }

        return true;
    }

}
