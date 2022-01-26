package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue=127;
        short shortValue=32000;
        int intValue=150000;
        long longValue=50000+10*(byteValue+shortValue+intValue);
        System.out.println("The long value is="+longValue);
    }
}

