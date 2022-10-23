package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * leet 199
 *
 */
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        traverse(list, root, 1);

        return list;
    }

    private void traverse(List<Integer> list, TreeNode node, int depth) {
        if (node == null) {
            return;
        }

        if (list.size() < depth) {
            list.add(node.val);
        }

        traverse(list, node.right, depth + 1);
        traverse(list, node.left, depth + 1);

    }

}
