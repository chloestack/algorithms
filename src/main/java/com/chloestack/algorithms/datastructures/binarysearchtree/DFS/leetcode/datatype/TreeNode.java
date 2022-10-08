package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> printNodes() {
        List<Integer> r = new ArrayList<>();
        getNode(this, r);
        return r;
    }

    private void getNode(TreeNode node, List<Integer> els) {

        if (node == null) {
            return;
        }

        els.add(node.val);

        getNode(node.left, els);

        getNode(node.right, els);

    }
}
