package com.company;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber1=new ComplexNumber(1.0,1.0);
        ComplexNumber complexNumber2=new ComplexNumber(2.5,-1.5);
        complexNumber1.add(1,2);
        System.out.println(complexNumber1.getReal());
        System.out.println(complexNumber1.getImaginary());
    }
}
