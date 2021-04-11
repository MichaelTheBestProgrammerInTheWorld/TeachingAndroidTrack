package conditions;

import java.util.Scanner;

public class CheckPositiveOrNegative {

    public static void main(String[] args) {

        int number ;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        number = sc.nextInt();
        if (number>0){
            System.out.println("number is positive");
        } else if (number<0){
            System.out.println("number is negative");
        } else {
            System.out.println("Zero");
        }
    }
}
