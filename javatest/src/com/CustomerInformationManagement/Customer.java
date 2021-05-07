package com.CustomerInformationManagement;

public class Customer {
    private String name;//姓名
    private char gender;//性别
    private int age;//年龄
    private String phone;//电话
    private String email;//电子邮箱

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.getName() + "\t" + this.getGender() + "\t" +
                this.getAge() + "\t" + this.getPhone() + "\t" + this.getEmail();
    }
}