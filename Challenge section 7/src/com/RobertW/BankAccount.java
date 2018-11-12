package com.RobertW;

public class BankAccount {


    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount (){
        this("12345", 250, "defaultName", "Default Email", "default phone number");
        System.out.println("default constructor called");
    }

    public BankAccount (String number , double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public String  getAccountNumber() {
        return this.accountNumber;
    }

    public double  getBalance() {
        return this.balance;
    }

    public String  getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }


    public void depositFunds (double depositfunds){
        if (depositfunds>0){
            this.balance += depositfunds;
            System.out.println("You have deposited " + depositfunds + " ammount of money");
            System.out.println("Your Balance is now " + this.balance);

        }else {
            System.out.println("Invalid Value To Deposit");
        }
    }

    public void withdrawFunds (double drawFunds){
        if (this.balance - drawFunds < 0){
            System.out.println("Only " + this.balance + " avaiable. Withdrawal not processed.");

        }else {
            this.balance -= drawFunds;
            System.out.println("Withdrawal of " + drawFunds + " processed. Your Balance is now " + this.balance + " funds");
        }
    }
}
