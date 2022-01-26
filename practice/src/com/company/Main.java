package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                if(i==1 || j==5 || i==10)
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
