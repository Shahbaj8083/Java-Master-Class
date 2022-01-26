package com.company;

public class Main {

    public static void main(String[] args) {
        int number=2;
        int endNumber=30;
        int count=0;
        while (number<=endNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number "+number);
            if(count==5)
                break;
        }

    }
	public static boolean isEvenNumber(int a)
        {
            if(a%2==0)
                return true;

            else
                return false;
        }

}
