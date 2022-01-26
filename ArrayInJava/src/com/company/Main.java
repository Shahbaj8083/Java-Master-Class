package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = printArray(5);//we should store array value in other array.
        int[] sortedArrayValue = sortedArray(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("At index " + i + ",sorted(descending order) value is " + sortedArrayValue[i]);
        }
    }

    public static int[] printArray(int number) {
        int[] arrayValue = new int[number];
        System.out.println("Enter five integer Values" + "\r");
        for (int i = 0; i < number; i++) {
            arrayValue[i] = sc.nextInt();
        }
        return arrayValue;
    }
    public static int[] sortedArray (int[] array ){
        int[] sortedArrayValue=new int[array.length];
        for(int i=0; i< array.length; i++){
            sortedArrayValue[i]= array[i];
        }
        int temp;
        boolean flag=true;
        while (flag){
            flag=false;
            for(int i=0; i< array.length-1; i++){
                if(sortedArrayValue[i]<sortedArrayValue[i+1]) {
                    temp = sortedArrayValue[i];
                    sortedArrayValue[i] = sortedArrayValue[i + 1];
                    sortedArrayValue[i + 1] = temp;
                    flag=true;
                }
            }
        }
        return sortedArrayValue;
    }
}
