package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode.datatype.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthTest {


    @Test
    void maxDepth() {

        TreeNode test4 = new TreeNode(9);
        TreeNode test3 = new TreeNode(15);
        TreeNode test2 = new TreeNode(7);
        TreeNode test1 = new TreeNode(20, test3, test2);
        TreeNode test0 = new TreeNode(3, test4, test1);

        System.out.println(test0.printNodes());
        MaximumDepth md = new MaximumDepth();
        assertEquals(3, md.maxDepth(test0));

        test1 = new TreeNode(2);
        test0 = new TreeNode(1, null, test1);

        System.out.println(test0.printNodes());
        assertEquals(2, md.maxDepth(test0));
        System.out.println(md.maxDepth(test0));
    }


}