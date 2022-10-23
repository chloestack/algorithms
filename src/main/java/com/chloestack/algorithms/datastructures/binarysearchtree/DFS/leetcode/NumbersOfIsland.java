package com.chloestack.algorithms.datastructures.binarysearchtree.DFS.leetcode;

/**
 * leet 200
 *
 */
public class NumbersOfIsland {


    private int m;
    private int n;

    public int numIslands(char[][] grid) {

        m = grid.length; // horizon
        n = grid[0].length; // vertical
        int result = 0;

        // 경계선에 연결되어 있는 O는 원래대로 돌려놓음
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') { // 방문하지 않은 island
                    result += 1;
                    sideTurn(grid, i, j);
                }
            }
        }

        return result;
    }

    private void sideTurn(char[][] board, int i, int j) {

        if (board[i][j] == '1') {
            board[i][j] = 'V'; // 방문한 곳은 체크
        }

        if (i > 0 && board[i - 1][j] == '1') {
            sideTurn(board, i - 1, j);
        }

        if (i < m - 1 && board[i + 1][j] == '1') {
            sideTurn(board, i + 1, j);
        }

        if (j > 0 && board[i][j - 1] == '1') {
            sideTurn(board, i, j - 1);
        }

        if (j < n - 1 && board[i][j + 1] == '1' ) {
            sideTurn(board, i, j + 1);
        }
    }

}
