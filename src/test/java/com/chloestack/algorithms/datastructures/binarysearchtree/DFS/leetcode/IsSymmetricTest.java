package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

class IsSymmetricTest {

    @Test
    void testIsSymmetric() {

        TreeNode test1 = new TreeNode(3);
        TreeNode test2 = new TreeNode(1);
        TreeNode test3 = new TreeNode(5);

        TreeNode compareA = new TreeNode(2, test1, test2);
        TreeNode compareB = new TreeNode(2, test2, test1);

        TreeNode target = new TreeNode(7, compareA, compareB);

        IsSymmetric sym = new IsSymmetric();
        System.out.println(sym.isSymmetric(target));
        System.out.println(target.printNodes());
    }

}