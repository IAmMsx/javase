package com.objectOriented1.Account_Customer_Bank;


public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];//********
    }

    public void addCustomer(String f, String l) {
        Customer tempCust = new Customer(f, l);
        customers[numberOfCustomer++] = tempCust;
    }

    public Customer getCustomer(int index) {
//        return customers[index];
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
