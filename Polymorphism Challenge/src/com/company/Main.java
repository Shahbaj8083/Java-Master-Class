//difficulty level:- easy
package com.company;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels=4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car engine is starting...";
    }

    public String accelerate(){
        return "Car speed is increasing";
    }

    public String brake(){
        return "Car stopped";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi car speed is increasing";
    }

    @Override
    public String brake() {
        return "Mitsubishi car stopped";
    }
}
class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Holden engine is starting";
    }

    @Override
    public String accelerate() {
        return "Holden car speed is increasing";
    }

    @Override
    public String brake() {
        return "Holden car stopped";
    }
}
class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford car speed is increasing";
    }

    @Override
    public String brake() {
        return "Ford car stopped";
    }
}

public class Main {

    public static void main(String[] args) {
    Car car=new Car("Base car",4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake()+"\n");

    Mitsubishi mitsubishi=new Mitsubishi("Dumdaar",6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake()+"\n");

        Holden holden=new Holden("Holden Dumdaar",8);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake()+"\n");

        Ford ford=new Ford("Ford Dumdaar",10);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake()+"\n");
    }

}
