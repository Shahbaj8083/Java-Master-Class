package com.company;

public class Main {

    public static void main(String[] args) {
        int position=calculateHighScorePosition(1500);
         displayHighScorePosition("Shahzad",position);

        int position0=calculateHighScorePosition(900);
        displayHighScorePosition("Shadab ",position0);

        int position1=calculateHighScorePosition(400);
        displayHighScorePosition("Shabaan",position1);

        int position2=calculateHighScorePosition(50);
        displayHighScorePosition("Shanta ",position2);
    }
    public static void displayHighScorePosition(String name,int position) {
        System.out.println(name+" managed to get position "+position+" on high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if(score>=1000)
            return 1;

        else if(score>=500)
            return 2;

        else if(score>=100)
            return 3;


            return 4;

    }

}
