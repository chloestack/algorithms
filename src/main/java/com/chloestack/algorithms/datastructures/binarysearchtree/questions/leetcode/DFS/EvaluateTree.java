package com.chloestack.algorithms.datastructures.binarysearchtree.questions.leetcode.DFS;

/**
 * Question. 2331
 * Depth First Search.
 * 깊이 우선 탐색 문제
 */
public class EvaluateTree {

    /**
     * 리프 노드인 경우 True, False. 리프가 아닌 경우 AND, OR
     * 리프가 있는 경우 리프의 참거짓 값을 판별하여 리프로 전환.
     * 최종적으로는 루트 노드만 남겨짐. 남겨진 값을 리턴.
     * 0 : false, 1: true, 2: OR, 3: AND
     */
    public static int AND = 3;
    public static int FALSE = 0;

    private boolean evaluate(TreeNode root) {

        // 둘다 리프일때
        if (root.left != null && root.right != null) {
            boolean left = evaluate(root.left);
            boolean right = evaluate(root.right);
            return root.val == AND ? left && right : left || right;
        }

        return root.val == FALSE ? false : true;
    }

    // java 14 이상에서만 지원 : switch arrow
//    private boolean evaluateUsingSwitch(TreeNode root) {
//        if (root == null) {
//            return false;
//        }
//
//        return switch(root.val) {
//            case 0 -> false;
//            case 1 -> true;
//            case 2 -> evaluateUsingSwitch(root.left) && evaluateUsingSwitch(root.right);
//            case 3 -> evaluateUsingSwitch(root.left) || evaluateUsingSwitch(root.right);
//            default -> throw new RuntimeException();
//        }
//
//    }

    public boolean evaluateTree(TreeNode root) {
        return evaluate(root);
    }
}
