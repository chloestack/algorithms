package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

class FlattenBinaryTreeTest {

    @Test
    void flatten() {

        TreeNode test22 = new TreeNode(6);
        TreeNode test2 = new TreeNode(5,null, test22);

        TreeNode test12 = new TreeNode(4);
        TreeNode test11 = new TreeNode(3);
        TreeNode test1 = new TreeNode(2, test11, test12);
        TreeNode test0 = new TreeNode(1, test1, test2);

        FlattenBinaryTree fb = new FlattenBinaryTree();
        System.out.println(test0.printNodes());
        fb.flatten(test0);
        System.out.println(test0.printNodes());
    }
}