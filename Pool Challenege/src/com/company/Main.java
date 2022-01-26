package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,4);
        Cuboid cuboid=new Cuboid(5,3,0);
        System.out.println(rectangle.getArea());
        System.out.println(cuboid.getVolume());
    }
}
