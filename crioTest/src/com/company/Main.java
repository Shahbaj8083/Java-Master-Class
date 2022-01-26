package com.company;

import java.sql.Array;
import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t<=10000) {
            int n = sc.nextInt();
            int result = largestFibonacciNumber(n);
            System.out.println("return value "+result);
        }
        sc.close();
    }

    static int largestFibonacciNumber(int n){
        int []myArray=new int[n];

        int i=0,secondLargestNumber;
        int n1=0,n2=1,n3=0;
       while (i<=n){//n / ((1 + Math.sqrt(5)) / 2.0))
          n3=n1+n2;

           System.out.println(n3);
           for(int j=0; j< myArray.length; j++){
                myArray[j]=n3;
           }
          n1=n2;
          n2=n3;
          i+=n3;
       }
       for(int k=0; k< myArray.length; k++){
           secondLargestNumber=myArray[k];
           if(secondLargestNumber==n){
               return myArray[k];
           }
           else if(secondLargestNumber<=n){
               n3= secondLargestNumber;
           }
       }
       return n3;
    }
}