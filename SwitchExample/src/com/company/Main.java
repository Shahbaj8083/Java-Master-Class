package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char switchValue;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A,B,C,D or E :");
        switchValue=sc.next().charAt(0);//scanning any character is difficult in java
        switch (switchValue) {
            case 'A':
                System.out.println("Its A");
                break;

            case 'B':
                System.out.println("Its B");
                break;

            case 'C':
                System.out.println("Its C");
                break;

            case 'D':
                System.out.println("Its D");
                break;

            case 'E':
                System.out.println("Its E");
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}
