package com.objectOriented3.project3.service;

import com.objectOriented3.project3.domain.*;
import org.junit.Test;

public class NameListService {
    private Employee[] employees;

    public NameListService() {

        employees = new Employee[Data.EMPLOYEES.length];
        // 装备
        Equipment[] equipments = new Equipment[Data.EQIPMENTS.length];
        for (int i = 0; i < Data.EQIPMENTS.length; i++) {
            if (Data.EQIPMENTS[i].length == 0) continue;
            switch (Integer.parseInt(Data.EQIPMENTS[i][0])){
                case 21:
                    equipments[i] = new PC(Data.EQIPMENTS[i][1],Data.EQIPMENTS[i][2]);
                case 22:
                    equipments[i] = new NoteBook(Data.EQIPMENTS[i][1],Double.parseDouble(Data.EQIPMENTS[i][2]));
                case 23:
                    equipments[i] = new Printer(Data.EQIPMENTS[i][1],Data.EQIPMENTS[i][2]);
            }
        }

        // 职员
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {

            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

            switch (Integer.parseInt(Data.EMPLOYEES[i][0])){
                case 10:
                    employees[i] = new Employee(id,name,age,salary);
                case 11:


                case 12:
                case 13:
            }
        }


    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        return employees[id];
    }


    @Test
    public void NameListTest() {
//        System.out.println(Data.EMPLOYEES.length);
        for (String[] employee : Data.EMPLOYEES) {
            for (int i = 0; i < employee.length; i++) {
                System.out.print(employee[i] + " ");
            }
            System.out.println();
        }
    }
    @Test
    public void DataEquipmentsTest(){
        System.out.println(Data.EQIPMENTS[0].length);

        Equipment[] equipments = new Equipment[Data.EQIPMENTS.length];
        for (int i = 0; i < Data.EQIPMENTS.length; i++) {
            if (Data.EQIPMENTS[i].length == 0) continue;
            switch (Integer.parseInt(Data.EQIPMENTS[i][0])){
                case 21:
                    equipments[i] = new PC(Data.EQIPMENTS[i][1],Data.EQIPMENTS[i][2]);
                case 22:
                    equipments[i] = new NoteBook(Data.EQIPMENTS[i][1],Double.parseDouble(Data.EQIPMENTS[i][2]));
                case 23:
                    equipments[i] = new Printer(Data.EQIPMENTS[i][1],Data.EQIPMENTS[i][2]);
            }
        }

    }


}
