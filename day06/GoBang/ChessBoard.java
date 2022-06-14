package com.lanou.day06.GoBang;

public class ChessBoard {

    public static final int ROW_COUNT = 15;  //行数
    public static final int COLUMN_COUNT  = 15; //列数
    private Piece pieceArray[][] = new Piece[ROW_COUNT][COLUMN_COUNT];

    public ChessBoard() {
    }

    public void printChessBoard(){
        String[] numbers = {"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        System.out.print(" ");
        for (int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < pieceArray.length; i++) {
            for (int j = 0; j < pieceArray[i].length; j++) {
                Piece pieces = pieceArray[i][j];
                System.out.println(pieces.getSymbol());
                if (j < 14){
                    System.out.print("──");
                }
            }
            System.out.println();
        }
    }

    public void initChessBoard(){
        Piece pieceArray[][] = new Piece[15][15];
        for (int i = 0; i < pieceArray.length; i++) {
            for (int j = 0; j < pieceArray[i].length; j++) {
                Piece piece = null;
                if (i==0){
                    if (j == 0){
                        piece = new Piece(i,j,'┌');
                    } else if (j == 14) {
                        piece = new Piece(i,j,'┐');
                    }else {
                        piece = new Piece(i,j,'┬');
                    }
                }else  if (i == 14){
                    if (j == 0){
                        piece = new Piece(i,j,'└');
                    }else if (j == 14){
                        piece = new Piece(i,j,'┘');
                    }else {
                        piece = new Piece(i,j,'┴');
                    }
                }else {
                    if (j == 0){
                        piece = new Piece(i,j,'├');
                    }else if (j == 14){
                        piece = new Piece(i,j,'┤');
                    }else {
                        piece = new Piece(i,j,'┼');
                    }
                }
                piece = pieceArray[i][j];
            }
        }
    }
}
