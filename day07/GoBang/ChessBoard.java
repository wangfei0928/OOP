package com.lanou.day07.GoBang;



public class ChessBoard {

    public static final int ROW_COUNT = 15;  //行数
    public static final int COLUMN_COUNT  = 15; //列数
    private static Piece pieces[][] = new Piece[ROW_COUNT][COLUMN_COUNT];

    public ChessBoard() {
    }
    public ChessBoard(Piece[][] pieces){
        this.pieces = pieces;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    /*
     * 初始化棋盘，  本质上是给数组pieceArray[]赋值   放棋盘元素
     * */
    public void initChessBoard(){
        Piece pieceArray[][] = new Piece[15][15];
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                Piece piece = null;
                if (i==0){
                    if (j == 0){
                        piece = new Piece(i,j,'┌');
                    } else if (j == COLUMN_COUNT - 1) {
                        piece = new Piece(i,j,'┐');
                    }else {
                        piece = new Piece(i,j,'┬');
                    }
                }else  if (i == ROW_COUNT - 1){
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
                pieces[i][j] = piece;
            }
        }
    }

    public void printChessBoard(){
        char[] numbers = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.print(" ");
        for (int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i <ROW_COUNT; i++) {
            System.out.print(numbers[i]);
            for (int j = 0; j < COLUMN_COUNT; j++) {
                //根据下标找到棋子
                Piece piece = pieces[i][j];
                System.out.print(piece.getSymbol());
                if (j < 14){
                    System.out.print("──");
                }
            }
            System.out.println();
        }
    }
    public static boolean canPutDownPiece(Location location){
        int row = location.getRow();
        int column = location.getColumn();
        Piece piece = pieces[row][column];
        if (piece.getSymbol()=='●'||piece.getSymbol() =='o'){
            return  false;
        }else {
            return true;
        }

    }

}
