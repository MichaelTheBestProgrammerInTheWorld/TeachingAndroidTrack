package session3.conditions;

import java.util.Scanner;

public class GreatestNum {

    public static void main(String[] args) {

        int first, second, third;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your first number ");
        first = scanner.nextInt();
        System.out.println("please enter your second number ");
        second = scanner.nextInt();
        System.out.println("please enter your third number ");
        third = scanner.nextInt();

        if (first >= second && first >= third){
            System.out.println(first + " is the greatest");
        } else if (second >= third && second >= first){
            System.out.println(second + " is the greatest");
        } else if (third >= first && third >= second){
            System.out.println(third + "is the greatest");
        } else {
            System.out.println("invalid");
        }
    }
}
