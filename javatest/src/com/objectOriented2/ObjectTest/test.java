package com.objectOriented2.ObjectTest;

public class test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);
        if (c1.getColor().equals(c2.getColor())) {
            System.out.println("颜色相同");
        } else {
            System.out.println("不同");
        }
        System.out.println(c2.findArea());
        if (c1.equals(c2)) {
            System.out.println("半径相同");
        } else {
            System.out.println("butong");
        }
        System.out.println("*************************************");
        System.out.println(c1 + "\t" + c2);
    }
}
