package com.company;

public class Main {

    public static void main(String[] args) {
	Point point=new Point();
        System.out.println(point.distance());

    Point point1=new Point(6,5);
    Point point2=new Point(3,1);
        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));
    }
}
