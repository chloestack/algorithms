package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leet 112
 * Given TreeNode has Root-to-Leaf Sum which is equals targetSum
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // return verifyType1(root, targetSum, root.val);
        return verifyType2(root, targetSum);
    }

    private boolean verifyType1(TreeNode node, int targetSum, int sum) {

        if (node.left == null && node.right == null) {
            return sum == targetSum ? true : false;
        }

        if (node.left != null ) {
            if(verifyType1(node.left, targetSum, sum + node.left.val)){
                return true;
            }
        }

        if (node.right != null ) {
            if(verifyType1(node.right, targetSum, sum + node.right.val)){
                return true;
            }
        }

        return false;
    }

    private boolean verifyType2(TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }

        targetSum -= node.val;

        if (node.left == null && node.right == null) {
            if (targetSum == 0) {
                return true;
            } else {
                return false;
            }
        }

        return verifyType2(node.left, targetSum) || verifyType2(node.right, targetSum);
    }


}
