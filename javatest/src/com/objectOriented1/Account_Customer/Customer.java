package com.objectOriented1.Account_Customer;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer["+this.getLastName()+","+this.getFirstName()+
                "] has a account: id is" +this.getAccount().getId()+","+"\n"+
                "accnulInterestRate is "+this.getAccount().getAnnualInterestRate()*100+
                "% ,balance is "+this.getAccount().getBalance();
    }
}
