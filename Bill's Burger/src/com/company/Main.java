package com.company;

public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger =new Hamburger("Base Burger","Brown","Sauces",5);
//        hamburger.addHamburgerAddition1("lettuce",1);
//        hamburger.addHamburgerAddition2("carrot",2);
//        hamburger.addHamburgerAddition3("tomato",2);
//        hamburger.addHamburgerAddition4("chutney",0.5);
//
//        double total=hamburger.itemizeHamburger();
//        System.out.println("Total Cost="+total);

//    HealthyBurger healthyBurger=new HealthyBurger("beef",10);
//
//    healthyBurger.addHealthyAddition1("egg",5);
//    healthyBurger.addHealthyAddition2("lentils",7.5);
//        System.out.println("Total cost "+healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger=new DeluxeBurger();
//        deluxeBurger.addHamburgerAddition1();
//        deluxeBurger.addHamburgerAddition2();
        double total=deluxeBurger.itemizeHamburger();
        System.out.println("Total price is "+total);
        deluxeBurger.addHamburgerAddition1("aalu",2);

    }

}
