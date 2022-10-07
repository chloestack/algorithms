package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    @Test
    void isBalancedTrue() {

        TreeNode test4 = new TreeNode(9);
        TreeNode test3 = new TreeNode(15);
        TreeNode test2 = new TreeNode(7);
        TreeNode test1 = new TreeNode(20, test3, test2);
        TreeNode test0 = new TreeNode(3, test4, test1);

        BalancedBinaryTree bbt = new BalancedBinaryTree();
        System.out.println("First");
        assertEquals(true, bbt.isBalanced(test0));


        TreeNode test4Val = new TreeNode(4);
        TreeNode test3Val = new TreeNode(3);
        TreeNode test2Val = new TreeNode(2);
        TreeNode test1Val = new TreeNode(1);
        test3 = new TreeNode(3, test4Val, test4Val);
        test2 = new TreeNode(2, test3, test3Val);
        test1 = new TreeNode(20, test2, test2Val);
        test0 = new TreeNode(3, test1, test1Val);
        System.out.println("Second");
        assertEquals(false, bbt.isBalanced(test0));
    }

}