package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;


import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;

/**
 * Question 99.
 *  Recover Binary Search Tree
 * Depth First Search
 */
public class RecoverBST {
    private TreeNode prev, first, middle, last;

    public void inorder(TreeNode root){

        if(root == null) {
            return;
        }

        // left 가 null 이 되면 다음으로 진행
        inorder(root.left);

        // prev -> left. left 는 현재 값 보다 항상 작아야 하는데 클 경우 위반.
        if ( prev != null && root.val < prev.val){
            // 최초 위반 노드는 first 혹은 middle
            // 비교한 최초 인접 노드가 서로 위반일 경우.
            if(first == null){
                first = prev;
                middle = root; // 마지막 노드가 발견되지 않을 경우 위반 노드.
            } else { // 마지막 노드와 최초 노드가 위반 노드쌍일 경우.
                last = root;
            }
        }

        prev = root;

        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {

        prev = new TreeNode(Integer.MIN_VALUE);

        inorder(root);

        // 마지막 노드가 없을 확률이 높으니 조건문 처음에 비교.
        if ( last != null && first != null ){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        } else if( first != null && middle != null ){
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }

    }
}
