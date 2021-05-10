package com.objectOriented3.Abstract;

public abstract class employee {
    private String name;
    private String number;
    private MyData birthday;

    public abstract long earning(long month);

    public employee() {
    }

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    public employee(String name, String number, MyData birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "名字:" + name + " 序号" + number + " 生日:" + birthday;
    }
}
