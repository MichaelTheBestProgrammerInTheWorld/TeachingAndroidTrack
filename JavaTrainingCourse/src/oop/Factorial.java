package oop;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a positive number");
        int userInput = scanner.nextInt();

        if (userInput < 0){
            System.out.println("invalid input");
        } else {
            for (int i=1; i<=userInput; i++){
                factorial *= i;
            }

            System.out.println("factorial = " + factorial);
        }
    }
}
