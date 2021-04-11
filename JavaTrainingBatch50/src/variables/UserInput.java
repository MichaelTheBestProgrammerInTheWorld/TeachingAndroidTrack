package variables;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        String username;
        System.out.println("whats your name?");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
        System.out.println("Welcome " + username);

    }
}
