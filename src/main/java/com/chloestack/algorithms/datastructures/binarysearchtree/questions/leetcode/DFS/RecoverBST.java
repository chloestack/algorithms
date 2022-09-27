package com.chloestack.algorithms.datastructures.binarysearchtree.questions.leetcode.DFS;

/**
 * Question 99.
 *  Recover Binary Search Tree
 * Depth First Search
 * Root -> Left -> Right -> Left's Left -> Left's Right -> Right's Left -> Right's Right
 * All Left Node is smaller than Root And Bigger than Upper Root
 * All Right Node is Bigger than Root And Smaller than Upper Root
 */
public class RecoverBST {

    private TreeNode abnormal;

    private void recover(TreeNode target) {

        // abnormal state :: left 값이 root 보다 큰 경우
        if (target.left != null && (target.left.val > target.val)) {
            if(switchNode(target.left)) {
                return;
            }
        }

        // abnormal state :: right 값이 root 보다 작은 경우
        if (target.right != null && (target.right.val < target.val)) {
            if(switchNode(target.right)) {
                return;
            }
        }

    }

    private boolean switchNode(TreeNode targetNode) {
        if (abnormal == null) {
            abnormal = targetNode;
            return false;
        } else {
            int temp = targetNode.val;
            targetNode.val = abnormal.val;
            abnormal.val = temp;
            return true;
        }
    }

    public void recoverTree(TreeNode root) {
        recover(root);
    }
}
