package com.chloestack.algorithms.datastructures.binarysearchtree;

public class DFSPreOrder {

    void preOrder(BinaryTreeNode root) {

        if (root != null) {
            System.out.println(root.getElement());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

}
