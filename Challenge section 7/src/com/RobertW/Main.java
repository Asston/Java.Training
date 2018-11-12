package com.RobertW;

public class Main {

    public static void main(String[] args) {
        BankAccount lol2 = new BankAccount();

	BankAccount RobertWajner = new BankAccount("12345", 50000, "Robert Wajner", "robertwajner1@gmail.com", "692170502");


        System.out.println("Your Balance is " + RobertWajner.getBalance());


        RobertWajner.depositFunds(500);

        RobertWajner.withdrawFunds(5500);

        RobertWajner.withdrawFunds(50);

        BankAccount Robert2 = new BankAccount("Robertwajner", "rob@gmail.com", "692170502");
        System.out.println(Robert2.getCustomerName() + Robert2.getAccountNumber());




        VipCustomer Robert = new VipCustomer();
        System.out.println("Name is " + Robert.getName());

        VipCustomer Robert22 = new VipCustomer("robert", 500.0, "rob@o2.pl");
        System.out.println("drugi dziala " + Robert22.getEmailAdress());
    }
}
