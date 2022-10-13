package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {


    @Test
    void solve() {

        SurroundedRegions sr = new SurroundedRegions();

        char[][] board = new char[4][4];
        board[0] = new char[]{'X', 'X', 'X', 'X'};
        board[1] = new char[]{'X', 'O', 'O', 'X'};
        board[2] = new char[]{'X', 'X', 'O', 'X'};
        board[3] = new char[]{'X', 'O', 'X', 'X'};

        sr.solve(board);
        Arrays.stream(board).forEach(b -> System.out.println(b));

        SurroundedRegions sr1 = new SurroundedRegions();

        char[][] board1 = new char[4][4];
        board1[0] = new char[]{'X', 'X', 'X', 'X'};
        board1[1] = new char[]{'X', 'X', 'O', 'X'};
        board1[2] = new char[]{'X', 'X', 'O', 'X'};
        board1[3] = new char[]{'X', 'X', 'O', 'X'};

        sr1.solve(board1);
        Arrays.stream(board1).forEach(b -> System.out.println(b));

//        char[][] test = new char[2][4];
//        test[0] = new char[]{'X', 'X', 'X', 'X'};
//        test[1] = new char[]{'X', 'O', 'X', 'X'};
//
//        sr.solve(test);
//        Arrays.stream(test).forEach(b -> System.out.println(b));
    }
}