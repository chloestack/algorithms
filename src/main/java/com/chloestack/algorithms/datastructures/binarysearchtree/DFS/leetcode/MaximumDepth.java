package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;

/**
 * Leet 104.
 */
public class MaximumDepth {

    public int maxDepth(TreeNode root ) {

        if (root == null) {
            return 0;
        }

        return countDepth(root, 1);
    }

    private int countDepth(TreeNode root, int sum){
        if (root.left == null && root.right == null) {
            return sum;
        }

        if (root.left != null) {
            if (root.right != null) {
                int l = countDepth(root.left, sum + 1);
                int r = countDepth(root.right, sum + 1);
                return l >= r ?  l : r;
            } else {
                return countDepth(root.left, sum + 1);
            }
        }

        return countDepth(root.right, sum + 1);

    }

}
