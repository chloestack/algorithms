package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

/**
 * leet 114
 * Binary Tree -> LinkedList
 *  root is minimum value
 *
 * reorganize ::
 */
public class FlattenBinaryTree {

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
    }
}
