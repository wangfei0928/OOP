package com.lanou.day07.GoBang;

import com.lanou.day06.GoBang.ChessBoard;

public class Game {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.initChessBoard();
        chessBoard.printChessBoard();

        startGame();
    }

    public static void startGame(){

        //1. 黑子下棋
        //提示黑子下棋
        System.out.print("黑方下棋,请输入落子位置，(例如6,A):");
        //获取黑子落子位置

        Location location = Rule.getLocation();
        //判断是否能在此处落子


    }
}
