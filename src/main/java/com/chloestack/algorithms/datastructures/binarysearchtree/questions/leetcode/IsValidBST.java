package com.chloestack.algorithms.datastructures.binarysearchtree.questions.leetcode;

public class IsValidBST {

    public boolean validate(TreeNode root, Integer low, Integer high) {

        if (root == null) {
            return true;
        }
        // low (left) 값이 있고 그 값이 root 값보다 큰 경우.
        // 혹은 high(right) 값이 있고 그 값이 root 값 보다 작은 경우.
        // 이진탐색트리가 아님
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

}
