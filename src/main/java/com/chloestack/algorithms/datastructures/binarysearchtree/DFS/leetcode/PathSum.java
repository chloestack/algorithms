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

        return verify(root, targetSum);
    }

    /**
     *
     * @param node
     * @param targetSum
     * @return
     */
    public boolean verify(TreeNode node, int targetSum) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);

        int sum = node.val; // default
        int temp = 0;

        while(!q.isEmpty()) {
            int size = q.size();

            for (int i = 0 ; i < size ; i++ ) {

            }

        }
        return temp == targetSum ? true : false;
    }
}
