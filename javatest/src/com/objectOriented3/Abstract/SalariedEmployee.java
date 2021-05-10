package com.objectOriented3.Abstract;

public class SalariedEmployee extends employee{
    private long monthlySalary;

    public SalariedEmployee(long monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, String number, MyData birthday, long monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public long earning(long month) {
        if (this.getBirthday().getMonth()==month){
            System.out.println("monthly本月生日！");
            monthlySalary+=100;
        }
        return monthlySalary;

    }

    @Override
    public String toString() {
        return "类型：monthly，"+super.toString();
    }
}
