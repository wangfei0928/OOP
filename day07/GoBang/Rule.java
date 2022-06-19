package com.lanou.day07.GoBang;

import java.util.Scanner;

public class Rule {

    //创建一个Scanner对象，用于接收用户输入
    private static Scanner scanner = new Scanner(System.in);

    //获取骡子位置
    public static Location getLocation(){
        //获取用户输入的全部内容
        String input = scanner.nextLine();
        //只要输入的内容长度不是3，输入的行号，列号，不符合就要让用户重新输入
        while (input.length()!=3||isRightCharacter(input.charAt(0))==false||input.charAt(1)!=','||isRightCharacter(input.charAt(2))==false){
            System.out.print("输入的坐标有误，请重新输入:");
            input =scanner.nextLine();
        }
        //获取用户输入的行号
        char rowChar = input.charAt(0);
        //获取用户输入的列号
        char columnChar = input.charAt(2);
        //用户输入的行号或者列号是从1开始，我们数值下标是从0开始  A应该是下标9，B = 10
        //把行号和列号转换为数组下标

      int row = indexForChar(rowChar);
      int column = indexForChar(columnChar);

      Location location = new Location(row,column);
      return location;
    }

    /**
     * 判断给定的字符是否正确
     * @param c 给定的字符
     * @return  正确--true
     */
    private static boolean isRightCharacter(char c){
        if (c >= '1' && c <= '9'||(c >= 'A' && c<= 'F')||(c >= 'a' && c<= 'f')){
            return  true;
        }else {
            return false;
        }
    }

    /**
     * 把字符转换为数组下标
     * @param c 需要转换成下标的字符
     * @return
     */
    private static int indexForChar(char c){
        int index = -1;
        if (c >= '1' && c <='9'){
            index = c - '1';  //
        }else if (c>='a'&&c<='f'){
            index = c - 'a' + 9;   //假设c的字符是'd', 100-97+9 = 12;
        }else if (c >= 'A' && c <= 'F'){
            index = c - 'A' + 9;
        }
        return index;
    }

    /**
     * 判断指定位置是否可以落子
     * @param location 指定位置
     * @return  如果能 true  不能 false
     */

}
