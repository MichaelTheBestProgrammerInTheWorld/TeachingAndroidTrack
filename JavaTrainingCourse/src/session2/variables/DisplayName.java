package session2.variables;

import java.util.Scanner;

public class DisplayName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();

        System.out.println("welcome " + name);
    }
}
