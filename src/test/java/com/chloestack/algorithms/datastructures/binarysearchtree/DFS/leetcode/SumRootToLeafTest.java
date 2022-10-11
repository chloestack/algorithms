package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafTest {

    @Test
    public void sumNumbers() {

        TreeNode test1 = new TreeNode(2);
        TreeNode test2 = new TreeNode(3);
        TreeNode test3 = new TreeNode(1, test1, test2);

        SumRootToLeaf sr = new SumRootToLeaf();
        System.out.println(sr.sumNumbers(test2));

    }
}