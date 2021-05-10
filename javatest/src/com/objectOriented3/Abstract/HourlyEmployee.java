package com.objectOriented3.Abstract;

public class HourlyEmployee extends employee {
    private long wage;
    private long hour;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(long wage, long hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, String number, MyData birthday, long wage, long hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public long earning(long month) {
        if (this.getBirthday().getMonth() == month) {
            System.out.println("hourly本月生日！");
            return wage * hour + 100;
        }
        return wage * hour;
    }

    @Override
    public String toString() {
        return "类型：hourly，" + super.toString();
    }
}
