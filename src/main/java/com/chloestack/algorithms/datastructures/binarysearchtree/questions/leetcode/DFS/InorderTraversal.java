package com.chloestack.algorithms.datastructures.binarysearchtree.questions.leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * Question. 94
 *  Binary Tree Inorder Traversal
 * Depth First Search.
 * 깊이 우선 탐색 문제 :: 중위순회
 */
public class InorderTraversal {

    private void traverse(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        if (root.left != null) {
            traverse(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            traverse(root.right, result);
        }

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

}
