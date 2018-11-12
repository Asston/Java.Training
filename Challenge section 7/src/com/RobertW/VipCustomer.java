package com.RobertW;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer (){
        this("default Name", 50000.0, "default email adress");
    }

    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"robert@o2.pl");
    }
    public VipCustomer(String name, double  creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
