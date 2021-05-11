package com.objectOriented3.project3.view;

import org.junit.Test;

import java.util.Scanner;

public class TSutility {
    public static Scanner scanner = new Scanner(System.in);


    public static char readMenuSelection() {
        char tag;
        for (; ; ) {
            tag = readKeyBoard(1).charAt(0);
            if (tag != '1' && tag != '2' &&
                    tag != '3' && tag != '4') {
                System.out.print("请重新输入：");
                continue;
            } else break;
        }
        return tag;

    }

    public static void readReturn(){
        System.out.print("恩回车继续：");
        readKeyBoard(0);
    }

    public static char readConfirmSelection(){
        char c;
        for (;;){
            c = readKeyBoard(1).toUpperCase().charAt(0);
            if (c == 'Y' || c=='N'){
                break;
            }else {
                System.out.println("Y/N,请重新输入");
            }

        }
        return c;
    }


    public static int readInt(){
        int tempInt;
        for (;;){
            try {
                tempInt = Integer.parseInt(readKeyBoard(2));
                return tempInt;
            } catch (NumberFormatException e) {
                System.out.print("输入数字。请重新输入");
            }
        }
    }


    public static String readKeyBoard(int limit) {

        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (limit == 0) return line;
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输出长度不大于" + limit);
                continue;
            }
            break;
        }
        return line;
    }

    @Test
    public void intTest(){
        System.out.println("*****");
        System.out.println(readInt());
    }
}
