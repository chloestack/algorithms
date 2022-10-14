package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * leet 130
 *
 */
public class SurroundedRegions {

    private int m;
    private int n;

    public void solve(char[][] board) {

        m = board.length; // horizon
        n = board[0].length; // vertical

//
//        if (m == 0 || m < 2 || n == 0 || n < 2) {
//            return;
//        }

        // 주위에 있는 O 를 확인해서 가장자리에서부터 확인해들어감
        // 좌우 경계선
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                sideTurn(board, i, 0);
            }

            if (board[i][n - 1] == 'O') {
                sideTurn(board, i, n - 1);
            }
        }

        // 위아래 경계선
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                sideTurn(board, 0, j);
            }

            if (board[m - 1][j] == 'O') {
                sideTurn(board, m - 1, j);
            }
        }

        // 경계선에 연결되어 있는 O는 원래대로 돌려놓음
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void sideTurn(char[][] board, int i, int j) {

        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return;
        }

        if (board[i][j] == 'O') {
            board[i][j] = '1'; // 방문한 곳은 체크
        }

        if (i > 1 && board[i - 1][j] == 'O') {
            sideTurn(board, i - 1, j);
        }

        if (i < m - 2 && board[i + 1][j] == 'O') {
            sideTurn(board, i + 1, j);
        }

        if (j > 1 && board[i][j - 1] == 'O') {
            sideTurn(board, i, j - 1);
        }

        if (j < board[i].length - 2 && board[i][j + 1] == 'O' ) {
            sideTurn(board, i, j + 1);
        }
    }
}
