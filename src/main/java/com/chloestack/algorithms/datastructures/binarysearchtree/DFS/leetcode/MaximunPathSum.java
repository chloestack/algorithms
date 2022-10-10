package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

/**
 * leet 124
 *
 *  인접 노드의 합이 가장 큰 경로 찾기
 *
 */
public class MaximunPathSum {

    public int maxPathSum(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        findMaximumPath(root, maxSum);
        return maxSum;
    }

    private int findMaximumPath(TreeNode node, int maxSum) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(findMaximumPath(node.left, maxSum), 0);
        int right = Math.max(findMaximumPath(node.right, maxSum), 0);

        maxSum = Math.max(maxSum, node.val + left + right);
        return node.val + Math.max(left, right);
    }

}
