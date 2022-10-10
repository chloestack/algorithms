package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {


    @Test
    void hasPathSum() {

        TreeNode test8 = new TreeNode(7);
        TreeNode test7 = new TreeNode(2);
        TreeNode test6 = new TreeNode(11, test8, test7);
        TreeNode test5 = new TreeNode(4, test6, null);
        TreeNode test4 = new TreeNode(1);
        TreeNode test3 = new TreeNode(4, null, test4);
        TreeNode test2 = new TreeNode(13);
        TreeNode test1 = new TreeNode(8, test2, test3);
        TreeNode test0 = new TreeNode(5, test5, test1);

        PathSum ps = new PathSum();
        System.out.println(test0.printNodes());
        assertEquals(true, ps.hasPathSum(test0, 22));
    }
}