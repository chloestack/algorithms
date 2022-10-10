package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthTest {

    @Test
    void minDepth() {

        TreeNode test4 = new TreeNode(9);
        TreeNode test3 = new TreeNode(15);
        TreeNode test2 = new TreeNode(7);
        TreeNode test1 = new TreeNode(20, test3, test2);
        TreeNode test0 = new TreeNode(3, test4, test1);

        System.out.println(test0.printNodes());
        MinDepth md = new MinDepth();
        assertEquals(2, md.minDepth(test0));

        test4 = new TreeNode(2);
        test3 = new TreeNode(2, null, test4);
        test2 = new TreeNode(2, null, test3);
        test1 = new TreeNode(2, null, test2);
        test0 = new TreeNode(1, null, test1);

        System.out.println(test0.printNodes());
        assertEquals(5, md.minDepth(test0));
        System.out.println(md.minDepth(test0));

    }
}