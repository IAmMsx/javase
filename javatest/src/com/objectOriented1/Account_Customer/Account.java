package com.objectOriented1.Account_Customer;

public class Account {
    private int id;
    private double balance;// 账户余额
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double account) {
        if (balance < account) {
            System.out.println("meiqian");
        } else {
            System.out.println("qule" + account);
            balance -= account;
            System.out.println("haisheng" + balance);
        }

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("存完共有"+balance);

    }

}
