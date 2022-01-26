package com.company;

public class Main {

    public static void main(String[] args) {
        float minFloatValue=Float.MIN_VALUE;
        float maxFloatValue=Float.MAX_VALUE;
        System.out.println("Minimum Float value="+minFloatValue);
        System.out.println("Maximum Float value="+maxFloatValue);

        double minDoubleValue=Double.MIN_VALUE;
        double maxDoubleValue=Double.MAX_VALUE;
        System.out.println("Minimum Double value="+minDoubleValue);
        System.out.println("Maximum Double value="+maxDoubleValue);

        //	float floatValue=23;correct but not ethical way
        //float floatValue=23.00;   incorrect
        float floatValue=33f/2f;//correct way
        double doubleValue=33d/2d;//decimal value is 'double' byDefault
        System.out.println("Float value="+floatValue);
        System.out.println("Double value="+doubleValue);

    }
}

