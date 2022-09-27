package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.BinaryTreeNode;
import com.chloestack.algorithms.datastructures.binarysearchtree.DFSPreOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DFSPreOrderTest {

    @Test
    void preOrder() {

        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> left1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> left2 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> left3 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> right1 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> right2 = new BinaryTreeNode<>(6);
        BinaryTreeNode<Integer> right3 = new BinaryTreeNode<>(7);

        left1.setLeft(left2);
        left1.setRight(left3);
        right1.setLeft(right2);
        right1.setRight(right3);
        node1.setLeft(left1);
        node1.setRight(right1);

        DFSPreOrder dfsPreOrder = new DFSPreOrder();
        dfsPreOrder.preOrder(node1);
    }
}