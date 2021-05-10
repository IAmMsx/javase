package com.objectOriented3.Abstract;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        employee[] emees = new employee[10];
        emees[0] = new SalariedEmployee("li1", "0001", new MyData(98,1,24),100);
        emees[1] = new SalariedEmployee("li2", "0001", new MyData(98,2,24),100);
        emees[2] = new SalariedEmployee("li3", "0001", new MyData(98,3,24),100);
        emees[3] = new HourlyEmployee("li4", "0001", new MyData(98,1,24),10,10);
        emees[4] = new HourlyEmployee("li5", "0001", new MyData(98,2,24),10,10);
        emees[5] = new HourlyEmployee("li5", "0001", new MyData(98,3,24),10,10);


        Scanner sc = new Scanner(System.in);
        long month = sc.nextLong();

        for (int i = 0; i < 6; i++) {
            System.out.println(emees[i]);
            System.out.println(emees[i].earning(month));
        }
    }
}
