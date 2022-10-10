package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leet 111.
 *
 */
public class MinDepth {

    public int minDepth(TreeNode root) {
        // return findShortestDepth(root, 0);
        return usingQueue(root);
    }

    private int findShortestDepth(TreeNode node, int min) {
        if (node == null) {
            return min;
        }

        if (node.left != null && node.right != null) {
            int l = findShortestDepth(node.left, min + 1);
            int r = findShortestDepth(node.right, min + 1);

            return l > r ? ( r == 1 ? l : r) : (l == 1 ? r : l);
        } else if (node.left != null && node.right == null) {
            return findShortestDepth(node.left, min + 1);
        } else {
            return findShortestDepth(node.right, min + 1);
        }
    }

    private int usingQueue(TreeNode node) {
        if (node == null ) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);

        int depth = 1; // default

        while(!q.isEmpty()) {
            int size = q.size();

            for (int i = 0 ; i < size ; i++ ) {
                TreeNode c = q.poll();

                if (c.left == null && c.right == null) {
                    return depth;
                }

                if (c.left != null) {
                    q.offer(c.left);
                }

                if (c.right != null) {
                    q.offer(c.right);
                }
            }

            depth++;
        }
        return depth;
    }

}
