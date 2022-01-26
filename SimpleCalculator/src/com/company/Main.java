package com.company;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator=new SimpleCalculator();
    calculator.setFirstNumber(2.34);
    calculator.setSecondNumber(0);

        System.out.println("First Number is :"+calculator.getFirstNumber());
        System.out.println("Second number is :"+calculator.getSecondNumber());
        System.out.println("********************************");
        System.out.println("Add "+calculator.getAdditionResult());
        System.out.println("Subtract "+calculator.getSubtractionResult());
        System.out.println("Multiply "+calculator.getMultiplicationResult());
        System.out.println("Division "+calculator.getDivisionResult());
    }
}
