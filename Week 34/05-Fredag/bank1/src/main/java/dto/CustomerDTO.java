/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.BankCustomer;

/**
 *
 * @author Jeppe
 */
public class CustomerDTO {

    private int customerID;
    private String fullName; 
    private String accountNumber;
    private double balance;
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "customerID=" + customerID + ", fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }

    public CustomerDTO(BankCustomer b_customer) {
        this.customerID = b_customer.getId().intValue();
        this.fullName = b_customer.getFirstName() + " " + b_customer.getLastName();
        this.accountNumber = b_customer.getAccountNumber();
        this.balance = b_customer.getBalance();
    }
}