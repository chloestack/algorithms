package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

public class SumRootToLeaf {

    public int sumNumbers(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int[] sum = new int[3];
        sum[0] = root.val; // sum
        sum[1] = 0;
        sum[2] = 0; // pushed 1
        sumRootToLeaf(root, sum);
        return sum[0];
    }

    private void sumRootToLeaf(TreeNode root, int[] sum) {
        if (root == null) {
            return;
        }

        sum[1] = sum[1] * 10 + root.val;
        sum[2]++;

        if (root.left == null && root.right == null) {
            sum[0] += sum[1];
            return;
        }

        sumRootToLeaf(root.left, sum);
        if (root.left != null && sum[2] > 0) {
            sum[1] = sum[1] / 10;
            sum[2]--;
        }

        sumRootToLeaf(root.right, sum);
        if (root.right != null && sum[2] > 0) {
            sum[1] = sum[1] / 10;
            sum[2]--;
        }
    }
}
