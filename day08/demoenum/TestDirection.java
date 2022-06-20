package com.lanou.day08.demoenum;

public class TestDirection {

    public static void main(String[] args) {
        Direction direction = Direction.BEHIND;
        switch (direction){
            case LEFT:
                System.out.println("向左");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
            case FRONT:
                System.out.println("向前");
                break;
            case BEHIND:
                System.out.println("向后");
                break;
        }
    }



}
