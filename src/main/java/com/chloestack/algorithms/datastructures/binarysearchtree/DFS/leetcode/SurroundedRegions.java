package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

import java.nio.charset.Charset;
import java.util.Stack;

/**
 * leet 130
 *
 */
public class SurroundedRegions {

    public void solve(char[][] board) {

        this.width = board[0].length;
        this.height = board.length;

        sort(board, 0, 0, 0);
    }

    private int width = 0;
    private int height = 0;

    private int isBorder(int x, int y) {
        return x == 0 || x == width - 1 || y == 0 || y == height - 1 ? 1 : 0;
    }

    private int isEdgeZero(char[][] board, int x, int y) {

        if (isBorder(x, y) > 0) {
            return board[x][y] == 'O' ? 1 : 0;
        } else if (board[x][y] == 'X') {
            return 0;
        } else if (board[x-1][y] == 'O') {
            return isEdgeZero(board, x - 1, y);
        } else if (board[x+1][y] == 'O') {
            return isEdgeZero(board, x + 1, y);
        } else if (board[x][y - 1] == 'O') {
            return isEdgeZero(board, x, y - 1);
        } else if (board[x][y + 1] == 'O') {
            return isEdgeZero(board, x, y + 1);
        }

        // all X
        return 0;
    }

    private void sort(char[][] board, int x, int y, int hasX) {

        if (y >= height) {
            return;
        }

        if (board[x][y] == 'X') {
            hasX = 1;
        }

        if (hasX > 0 && board[x][y] == 'O' && isBorder(x, y) < 1 && isEdgeZero(board, x, y)  < 1) {
            board[x][y] = 'X';
        }

        boolean isEndLine = x >= width - 1; // x >= 3

        x = isEndLine ? 0 : x + 1;
        y = isEndLine ? y + 1 : y;

        sort(board, x , y, hasX);

    }

}
