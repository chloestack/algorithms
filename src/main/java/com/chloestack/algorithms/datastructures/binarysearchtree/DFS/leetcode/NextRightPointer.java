package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

/**
 * leet 116
 *
 * 같은 깊이의 바로 오른쪽에 위치한 노드를 가리키도록!
 */
public class NextRightPointer {

    public Node connect(Node root) {
        point(root, null);
        return root;
    }

    private void point(Node root, Node next) {
        if(root == null) {
            return;
        }

        root.next = next;
        point(root.left, root.right);
        point(root.right, root.next == null ? null : root.next.left);
    }


    /*

    passed

    private void leftToRight(Node root) {
        Node startNode = root;

        while(startNode != null && startNode.left != null) {

            Node goRightNode = startNode;
            boolean isLeft = true;

            while(goRightNode != null) {
                if (isLeft) {
                    goRightNode.left.next = goRightNode.right;
                    isLeft = false;
                } else { // right
                    if (goRightNode.next != null) {
                        goRightNode.right.next = goRightNode.next.left;
                        isLeft = true;
                    }
                    goRightNode = goRightNode.next;
                }
            }

            startNode = startNode.left;
        }
    }


     */


/*
    Time Limit Exceeded Version

    private Stack<Node> stR = new Stack<>();
    private Queue<Node> qL = new LinkedList<>();

    private void point(Node node) {

        if (node.left == null && node.right == null ) {
            return;
        }

        if (node.right != null) {
            if(!qL.isEmpty()) {
                node.right.next = qL.poll();
            }
            stR.push(node.right);
            point(node.right);
        }

        if (node.left != null) {
            if(!stR.isEmpty()) {
                node.left.next = stR.pop();
            }
            qL.offer(node.left);
            point(node.left);
        }
    }

 */
}
