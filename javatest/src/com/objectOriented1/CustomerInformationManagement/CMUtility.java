package com.objectOriented1.CustomerInformationManagement;

import java.util.Scanner;

public class CMUtility {

    private static Scanner sc = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("有误，请重新输入");
            } else break;
        }
        return c;
    }

    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static int readInt(int defaultCValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, true);
            if (str.equals("")) {
                return defaultCValue;
            }
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return (str.equals("")) ? defaultValue : str;
    }

    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c== 'N'){
                break;
            }else {
                System.out.println("错误，请重新输入： ");
            }
        }
        return c;
    }

    public static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() > limit) {
                System.out.println("输入长度（不大于" + limit + ") 错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
