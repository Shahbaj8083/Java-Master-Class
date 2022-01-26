package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int greaterNum=Integer.MIN_VALUE;
        int smallerNum=Integer.MAX_VALUE;
        while(true){
            int order=count+1;
            System.out.println("Enter the #"+order+ " number :");
            count++;
            boolean isInt=sc.hasNextInt();
            if(isInt) {
                int number = sc.nextInt();

                if (number > greaterNum) {
                    greaterNum=number;

                } if(number<smallerNum) {
                    smallerNum=number;
                }
            }
            else{
                break;
            }
            sc.nextLine();
        }
        sc.close();
        System.out.println(greaterNum+" is greater Number and "+smallerNum+
                " smaller number.");
  }
}
