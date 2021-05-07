package com.objectOriented1.Account_Customer_Bank;

public class Bank_test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(5000);

        bank.getCustomer(0).getAccount().deposit(6000);

        bank.getCustomer(0).getAccount().withdraw(5000);

        bank.addCustomer("sx","m");

        System.out.println(bank.getNumberOfCustomer());


    }
}
