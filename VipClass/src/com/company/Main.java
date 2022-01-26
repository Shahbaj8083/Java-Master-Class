package com.company;

public class Main {

    public static void main(String[] args) {
    VipCostumer costumer1=new VipCostumer();
        System.out.println(costumer1.getName());

    VipCostumer costumer2=new VipCostumer("bob",1000.00);
        System.out.println(costumer2.getName());

    VipCostumer costumer3=new VipCostumer("Chunnu",100.00,"chunnu@gmail");
        System.out.println(costumer3.getName());
    }
}
