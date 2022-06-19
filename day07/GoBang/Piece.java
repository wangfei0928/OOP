package com.lanou.day07.GoBang;

public class Piece {

    private int row;  //行坐标
    private int column; //列坐标
    private char symbol;  //棋盘的符号

    public Piece() {
    }

    public Piece(int row, int column, char symbol) {
        this.setRow(row);
        this.setColumn(column);
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if (row < 0){
            row = 0;
        }else if (row > 14){
            row = 14;
        }
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        if (column < 0){
            column = 0;
        }else if (column > 14){
            column = 14;
        }
        this.column = column;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol +"("+column+","+row+")";
    }
}
