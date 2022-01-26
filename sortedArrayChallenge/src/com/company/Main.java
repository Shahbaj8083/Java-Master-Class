package com.company;

public class Main {

    public static void main(String[] args) {
        SortedArray sortedArray=new SortedArray();


        int[] myArray=sortedArray.getIntegers(5);
        int[] mySortedArray=sortedArray.sortIntegers(myArray);
        sortedArray.printArray(mySortedArray);




    }
}
