package com.company;

public class Main {

    public static void main(String[] args) {
	double firstDoubleValue=20.00;
    double secondDoubleValue=80.00;
    double myThirdValue=(firstDoubleValue+secondDoubleValue)*100.00;
    double reminderValue=(myThirdValue%40.00);

    boolean noReminder=reminderValue==0?true:false;
        System.out.println(noReminder);
    }
}
