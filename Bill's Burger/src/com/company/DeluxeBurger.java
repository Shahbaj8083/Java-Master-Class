package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe burger","beef",13,"White");
        super.addHamburgerAddition1("egg",13);
        super.addHamburgerAddition2("salad",5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add more than two items !");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add more than two items !");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add more than two items !");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add more than two items !");
    }
}
