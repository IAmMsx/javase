package com.objectOriented2.ObjectTest;

import java.util.Scanner;
import java.util.Vector;

public class objectExam {
    public static void main(String[] args) {
        // 创建Vector数组
        Vector v = new Vector();

        int max = 0;
        // 2. 实例化Scanner对象
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("请输入学生成绩：");
//            line = Integer.parseInt(sc.nextLine());
            int line = sc.nextInt();
            if (line < 0) {
                break;
            } else {
                // 添加操作
                Integer inScore = new Integer(line);
                v.addElement(inScore);
            }
            // 获取最大值
            if (line > max) {
                max = line;
            }
        }
        sc.close();
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            Integer inScore = (Integer) obj;
//            int score = inScore;
            // 自动装箱
            if (max - inScore <= 10) {
                level = 'A';
            } else if (max - inScore <= 20) {
                level = 'B';
            } else if (max - inScore <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student-" + i + "score is " + inScore + ", grade is " + level);
        }


    }

}
