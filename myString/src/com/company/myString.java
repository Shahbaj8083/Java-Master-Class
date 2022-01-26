package com.company;

public class myString {
    public static void main(String []args)
    {
        String myStringValue="hello boy how you doing";
        String a="Excuse me !"+myStringValue;
        System.out.println(myStringValue);
        System.out.println(a);

        int myIntValue=50;
        String myStrValue=" 50 ";
        myStrValue=myStrValue+myIntValue;//integer value will be appended
        System.out.println(myStrValue);

        int val=2;
        val+=2;
        val*=3;
        System.out.println(val);
        val/=4;

        boolean ifElien=true;
        if(ifElien==true)
            System.out.println("Hello to earth");

        System.out.println(val);
    }
}

