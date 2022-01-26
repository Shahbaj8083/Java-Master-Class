package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle=new Circle(5);
    System.out.println(circle.getArea());

    Cylinder cylinder=new Cylinder(5,6);
        System.out.println(cylinder.getVolume());
    }
}
