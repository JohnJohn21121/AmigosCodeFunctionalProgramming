package org.example.datastructures;

import java.util.Arrays;

public class TwoDimensionArray {

    public static void main(String[] args) {
        //Tic Tac Toe Example
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[0][1] = '0';
        board[0][2] = '0';

        char[][] boardTwo = new char[][] {
                new char[]{'0','0','0'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'}
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
