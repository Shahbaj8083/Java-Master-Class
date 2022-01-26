package com.company;

public class Main {

    public static void main(String[] args) {
    gameMethods(100,12,15);
    gameMethods(200,20,10);
    }

    public static void gameMethods(int score,int level,int bonus)//methods
        {
          score=score+level*12+bonus;
            System.out.println(score);
        }


}
