package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digitSum(256));
    }

    public static int digitSum(int number){
        int rem=0; int sum=0;
        while(number>0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
            return sum;
    }
}
