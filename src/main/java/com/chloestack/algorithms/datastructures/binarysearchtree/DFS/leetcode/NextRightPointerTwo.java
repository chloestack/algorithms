package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.Node;

/**
 * leet 117
 *
 */
public class NextRightPointerTwo {

    public Node connect(Node root) {

        if(root == null) {
            return null;
        }

        point(root, null);
        return root;
    }

    private void point(Node node, Node next) {

        node.next = next;

        if (node.right != null) {
            point(node.right, getNext(node.next));
        }

        if (node.left != null) {
            point(node.left, node.right != null? node.right : getNext(node.next));
        }

    }

    private Node getNext(Node node) {
        if (node == null) {
            return null;
        }

        if (node.left != null) {
            return node.left;
        }

        if (node.right != null) {
            return node.right;
        }

        return getNext(node.next);
    }

}
