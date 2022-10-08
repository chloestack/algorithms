package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * leet 113
 *
 * TargetSum 이 되는 모든 경로 찾기
 */
public class PathSumTwo {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        find(root, result, new Path(targetSum));
        return result;

    }

    public class Path {

        int sum;
        List<Integer> path;

        Path(int targetSum) {
            this.sum = targetSum;
            this.path = new ArrayList<>();
        }

        public List<Integer> getPath() {
            List<Integer> result = new ArrayList<>();
            for (Integer i : this.path) {
                result.add(i);
            }
            return result;
        }

        public void add(TreeNode node) {
            this.sum -= node.val;
            this.path.add(node.val);
        }

        public boolean isMatch() {
            return this.sum == 0 ? true : false;
        }

        public void reverse(TreeNode node) {
            if (node == null) {
                return;
            }

            this.sum += node.val;
            this.path.remove(this.path.size() - 1);
        }

    }

    private void find(TreeNode node, List<List<Integer>> paths, Path p) {
        if (node == null) {
            return;
        }

        p.add(node);

        if(node.left == null && node.right == null) {
            if (p.isMatch()) {
                paths.add(p.getPath());
            }
            return;
        }

        find(node.left, paths, p);
        p.reverse(node.left);

        find(node.right, paths, p);
        p.reverse(node.right);
    }

}
