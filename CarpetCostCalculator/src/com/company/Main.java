package com.company;

public class Main {

    public static void main(String[] args) {
        Floor floor1=new Floor(2.75,4.0);
        Carpet carpet=new Carpet(3.5);
        Calculator calculator=new Calculator(floor1,carpet);
        System.out.println(calculator.getTotalCost());
    }
}
