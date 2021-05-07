package com.CustomerInformationManagement;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public int getTotal() {
        return total;
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        } else {
            System.out.println("满了 加不了了");
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index > total || index < 0) {
            System.out.println("index不存在或不合规");
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public Customer[] getAllCustomer() {
        return customers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

    public boolean deleteCustomer(int index) {
        if (index > total || index < 0) {
            System.out.println("index不存在或不合规");
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i++];
        }
        customers[total] = null;
        total--;
        return true;
    }
}
