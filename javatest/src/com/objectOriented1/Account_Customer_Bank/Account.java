package com.objectOriented1.Account_Customer_Bank;

public class Account {
    private double balance;//yu e

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("存完账户共有："+balance);
    }
    public void withdraw(double amount){
        if (balance<amount){
            System.out.println("余额为："+this.balance+", 钱不够");
        }else {
            balance-=amount;
            System.out.println("成功！还剩"+balance);
        }
    }
}
