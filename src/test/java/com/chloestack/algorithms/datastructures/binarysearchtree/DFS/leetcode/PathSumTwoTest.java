package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTwoTest {

    @Test
    void pathSum() {

        TreeNode test8 = new TreeNode(7);
        TreeNode test7 = new TreeNode(2);
        TreeNode test6 = new TreeNode(11, test8, test7);
        TreeNode test5 = new TreeNode(4, test6, null);
        TreeNode test4 = new TreeNode(1);
        TreeNode test41 = new TreeNode(5);
        TreeNode test3 = new TreeNode(4, test41, test4);
        TreeNode test2 = new TreeNode(13);
        TreeNode test1 = new TreeNode(8, test2, test3);
        TreeNode test0 = new TreeNode(5, test5, test1);

        PathSumTwo ps = new PathSumTwo();
        System.out.println(test0.printNodes());
        System.out.println(ps.pathSum(test0, 22));
        // [[5,4,11,2],[5,8,4,5]]
    }
}