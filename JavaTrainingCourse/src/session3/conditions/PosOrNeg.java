package session3.conditions;

import java.util.Scanner;

public class PosOrNeg {

    public static void main(String[] args) {

        Scanner cv = new Scanner(System.in);
        System.out.print("please enter a number ");
        int num = cv.nextInt();
        if (num > 0){
            System.out.println("the number is positive");
        } else if (num == 0){
            System.out.println("you entered zero");
        } else {
            System.out.println("the number is negative");
        }
    }
}
