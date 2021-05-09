package com.objectOriented2.ObjectTest;

import org.junit.Test;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
//    public Circle(double radius,)

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Circle circle = (Circle) o;
//
//        return Double.compare(circle.radius, radius) == 0;
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
//        return this.color.equals(((Circle) o).color) && this.weight == ((Circle) o).weight &&
//                this.radius == ((Circle) o).radius;
        return this.radius == circle.radius;
    }

    @Override
    public String toString() {
        return Double.toString(this.radius);
    }

//    @Test
//    public void testCircle(){
//        Circle c1 = new Circle(1.0);
//        Circle c2 = new Circle(2.0);
//        if (c1.getColor().equals(c2.getColor())) {
//            System.out.println("颜色相同");
//        } else {
//            System.out.println("不同");
//        }
//        System.out.println(c2.findArea());
//        if (c1.equals(c2)) {
//            System.out.println("半径相同");
//        } else {
//            System.out.println("butong");
//        }
//        System.out.println("*************************************");
//        System.out.println(c1 + "\t" + c2);
//    }

}
