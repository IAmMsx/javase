package com.objectOriented3.Abstract;

public class MyData {
    private long year;
    private long month;
    private long day;

    public MyData(long year, long month, long day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public long getMonth(){
        return month;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
