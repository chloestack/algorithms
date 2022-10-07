package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;

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
