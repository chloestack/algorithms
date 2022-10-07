package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;
import org.junit.jupiter.api.Test;

class SameTreeTest {

    @Test
    void testIsSameTree() {

        TreeNode test1 = new TreeNode(3);
        TreeNode test2 = new TreeNode(1);
        TreeNode test3 = new TreeNode(5);

        TreeNode compareA = new TreeNode(2, test1, test2);
        TreeNode compareB = new TreeNode(2, test3, test1);

        SameTree st = new SameTree();
        System.out.println(st.isSameTree(compareA, compareB));
        System.out.println(compareA.printNodes());
        System.out.println(compareB.printNodes());
    }

}