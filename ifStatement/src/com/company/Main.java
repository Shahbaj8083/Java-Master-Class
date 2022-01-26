package com.company;

public class Main {

    public static void main(String[] args) {
        int newValue=50;
	boolean isAlien=true;
    boolean isCar=false;

    if(newValue!=50)
        System.out.println("Its True");

    if(isAlien=false)//= operator is assignment op but its working as equal to"==" operator
        System.out.println("Hi! Alien");

    if(!isCar)//it works as not equals to.
        System.out.println("This is not a car");
    boolean wasCar=isCar?true:false;
    if(wasCar==false)
        System.out.println("wasCar was false");
    }
}
