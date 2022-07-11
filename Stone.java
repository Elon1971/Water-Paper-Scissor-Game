package com.company;

import java.util.Random;
import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
 System.out.println("Stone,paper,scissor game");
        System.out.println("There are five chances");
        System.out.println("Press 0 for 'Stone',1 for 'Paper',2 for 'Scissor'");
        System.out.println();
        int tc = 5;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ComputerPoint = 0;
        int YourPoint = 0;


        for (int i = 1; i <= tc; i++) {
            int x = sc.nextInt();
            int y = random.nextInt(3);
            if (x == 0 && y == 1) {
                System.out.println("You lose");
                ComputerPoint++;

            } else if (x == 0 && y == 2) {
                System.out.println("You Won");
                YourPoint++;

            } else if (x == 1 && y == 0) {
                System.out.println("You Won");
                YourPoint++;

            } else if (x == 1 && y == 2) {
                System.out.println("You lose");
                ComputerPoint++;

            } else if (x == 2 && y == 0) {
                System.out.println("You lose");
                ComputerPoint++;

            } else if (x == 2 && y == 1) {
                System.out.println("You Won");
                YourPoint++;

            }else if (x>3){
                System.out.println("Invalid");

            }else{
                System.out.println("Tie");
            }

            if (y==0){
                System.out.println("Computer Choice = Stone");
            }else if (y==1){
                System.out.println("Computer choice = Paper");
            }else{
                System.out.println("Computer Choice = Scissor");
            }

            if (x==0){
                System.out.println("Your Choice = Stone");
            }else if(x==1){
                System.out.println("Your Choice = Paper");
            }else{
                System.out.println("Your Choice = Scissor");
            }
        }
        System.out.println();
        if (ComputerPoint>YourPoint){
            System.out.println("Computer Point"+"="+ComputerPoint);
            System.out.println("Your Point"+"="+YourPoint);
            System.out.println("COMPUTER WON");
        }else if(ComputerPoint<YourPoint){
            System.out.println("Your Point"+"="+YourPoint);
            System.out.println("Computer Point"+"="+ComputerPoint);
            System.out.println("YOU WON");
        }else{
            System.out.println("Your Point"+"="+YourPoint);
            System.out.println("Computer Point"+"="+ComputerPoint);
            System.out.println("TIE");
        }
    }
}
