package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year of your birth :");
        boolean hasNextInt= sc.hasNextInt();
        if(hasNextInt){

        int dob=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name :");
        String name=sc.nextLine();

        int age=2021-dob;
        if(age>=0 && age<=100) {
            System.out.println("Your name is " + name + " and you are " + age + " years old.");
        }
        else{
            System.out.println(name+", Invalid year of birth !");
        }
        }
        else{
            System.out.println("Cannot parse the date.!");
        }
        sc.close();
    }
}
