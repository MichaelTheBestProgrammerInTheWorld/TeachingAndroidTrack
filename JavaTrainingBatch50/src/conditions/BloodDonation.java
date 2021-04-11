package conditions;

import java.util.Scanner;

public class BloodDonation {


    public static void main(String[] args) {

        int age, weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        age = scanner.nextInt();
        System.out.println("Please enter your weight");
        weight = scanner.nextInt();

        if (age>18){
            System.out.println("your age is ok");
            if (weight>50){
                System.out.println("you can donate blood");
            } else {
                System.out.println("you cannot donate");
            }
        }
    }
}
