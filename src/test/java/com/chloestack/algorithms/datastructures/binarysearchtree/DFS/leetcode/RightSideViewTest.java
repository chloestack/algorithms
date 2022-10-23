package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightSideViewTest {

    @Test
    void rightSideView() {

        TreeNode test2 = new TreeNode(2);
        TreeNode test1 = new TreeNode(1, test2, null);

        RightSideView rsv = new RightSideView();
        // rsv.rightSideView(test1);

        TreeNode test4 = new TreeNode(4);
        TreeNode test3 = new TreeNode(3);
        test2 = new TreeNode(2, test4, null);
        test1 = new TreeNode(1, test2, test3);

        rsv = new RightSideView();
        rsv.rightSideView(test1);

    }
}