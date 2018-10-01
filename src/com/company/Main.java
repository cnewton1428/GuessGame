package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Secretnumber, guess = 0;
        Secretnumber = 6;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it");
        guess = in.nextInt();

//        while (guess!= Secretnumber) {
//            System.out.println("That is incorrect. Guess again");
//            guess = in.nextInt();
//
//        }
//        System.out.println("You're right! You're a good guesser!");
//***********************************************************************************************
//initialization on first line itself unlike do while, while;

//        for (int i = 0; i <= guess; i++) {
//            if (guess == Secretnumber) {
//                System.out.println("You're right! You're a good guesser!");
//                break;
//            } else {
//                System.out.println("That is incorrect. Guess again");
//                guess = in.nextInt();
//            }
//        }


   //*******************************************************************************************************

        int i=0;
    do {
        if (guess != Secretnumber) {
            System.out.println("That is incorrect. Guess again");
            guess = in.nextInt();  //use this to stop the program from continuing to  infinity. Need to prompt user for input
        } else {
            System.out.println("You're right! You're a good guesser!");
            break; //for stopping the loop from continuing
        }
    } while (guess<= 10);
    }
    }
