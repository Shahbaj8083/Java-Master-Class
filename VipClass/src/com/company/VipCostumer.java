package com.company;

public class VipCostumer {
    private String name;//these are called fields
    private double creditLimit;
    private String emailAddress;


    public VipCostumer(){
        this("default name", 50000.00,"default emailAddress");
        System.out.println("This is default constructor");
    }
    public VipCostumer(String name,double creditLimit){
        this(name,creditLimit,"rinku@email");
     }

    public VipCostumer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
