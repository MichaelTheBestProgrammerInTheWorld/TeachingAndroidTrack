package session3.conditions;

import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scanner.nextInt();
        if (isEven(num)){
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }

    static boolean isEven(int number){
        if (number%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
