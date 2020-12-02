package session3.conditions;

import java.util.Scanner;

public class SwitchDemo {


    public static void main(String[] args) {

        String size  = "MB";

        switch (size) {

            case "KB":
                System.out.println("this is kilobyte");
                break;
            case "MB":
                System.out.println("this is megabyte");
                break;
            case "GB":
                System.out.println("this is gigabyte");
                break;
            case "TB":
                System.out.println("this is terabyte");
                break;
            default:
                System.out.println("undefined");
        }
    }
}
