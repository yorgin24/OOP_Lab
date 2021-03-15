package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Random rand = new Random();

        int user_input;
        int random_number = rand.nextInt(101); //karna maks 100, maka bound = 100 +1

        System.out.print("Guess a magic number between 0 and 100");
        while(true){
            try{
                System.out.print("\nEnter you guess: ");
                user_input = baca.nextInt();
            }catch (InputMismatchException e){
                System.err.println("Please enter a number!");
                baca.next(); // clear scanner wrong input
                continue; // continues to loop if exception is found
            }

            if (user_input > random_number){
                System.out.println("Your Guess is too high");
            }else if (user_input < random_number) {
                System.out.println("Your Guess is too low");
            }else if (user_input == random_number){
                System.out.println("Yes, the number is " + random_number);
                break;
            }
        }
    }
}
