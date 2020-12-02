package oop.inheritance;

import oop.Car;

public class Main2 {

    public static void main(String[] args) {

//        Programmer programmer = new Programmer(1990, "951753");
//        System.out.println("programmer basic salary = "
//        + programmer.getSalary());
//        System.out.println("programmer bonus = " +
//                programmer.getBonus());
//        int netSalary = programmer.getSalary()+programmer.getBonus();
//        System.out.println("programmer net salary = " +
//                netSalary);
//
//        programmer.name = "jnjnjvnj";
//        programmer.address = "cairo";

        Dell dell = new Dell("my computer", 1500, 1234);
        dell.displayCompInfo();
        System.out.println("model = " + dell.getModel());
//        Computer computer1 = new Computer("first computer ", 1500);
//        Computer computer2 = new Computer("second computer ", 2500);
//
//        computer1.price = 3000;
//
//        computer1.displayCompInfo();
    }
}
