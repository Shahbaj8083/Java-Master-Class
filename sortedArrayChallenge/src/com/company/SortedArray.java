package com.company;

import java.util.Scanner;

public class SortedArray {

  public static int[] getIntegers(int number){
    Scanner sc=new Scanner(System.in);
    int[] myArrayValue=new int[number];
    for(int i=0; i<number; i++){
      myArrayValue[i]=sc.nextInt();
    }
    return myArrayValue;
  }

  public static int[] sortIntegers(int[] array){
    int[] sortedArray=new int[array.length];
    for(int i=0; i< array.length; i++){
      sortedArray[i]=array[i];
    }
    int temp;
    boolean flag=true;
    while (flag){
      flag=false;
      for(int i=0; i< sortedArray.length-1; i++){
        if(sortedArray[i]<sortedArray[i+1]){
          temp=sortedArray[i];
          sortedArray[i]=sortedArray[i+1];
          sortedArray[i+1]=temp;
          flag=true;
        }
      }
    }
    return sortedArray;
  }

  public static void printArray(int[] array){
    for(int i=0; i< array.length; i++){
      System.out.println("Element "+i+" contents "+array[i]);
    }
  }
}
