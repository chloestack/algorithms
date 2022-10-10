package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

class RecoverBSTTest {

    @Test
    void testRecoverBST() {

        TreeNode test4 = new TreeNode(2);
        TreeNode test3 = new TreeNode(4, test4, null);
        TreeNode test2 = new TreeNode(1);
        TreeNode test1 = new TreeNode(3, test2, test3);

        System.out.println(test1.printNodes());

        RecoverBST r = new RecoverBST();
        r.recoverTree(test1);

        System.out.println(test1.printNodes());
    }

}