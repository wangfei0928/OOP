package com.lanou.day06.GoBang;

/**
 * 棋子类
 */
public class Piece {

    private int row;  //行坐标
    private int column; //列坐标
    private char symbol;  //棋盘的符号

    public Piece() {
    }

    public Piece(int row, int column, char symbol) {
        this.row = row;
        this.column = column;
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
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
        return "Piece{" +
                "row=" + row +
                ", column=" + column +
                ", symbol=" + symbol +
                '}';
    }
}
