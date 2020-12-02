package oop.inheritance;

public class Computer {

    String name;
    int price;

    Computer(String name, int price){
        this.name = name;
        this.price = price;
    }

    void displayCompInfo(){

        System.out.println("computer is = " + name
        + "  " + price);
    }

}
