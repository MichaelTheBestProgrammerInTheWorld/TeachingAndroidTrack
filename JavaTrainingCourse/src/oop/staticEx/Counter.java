package oop.staticEx;

public class Counter {

    int normalCounter = 0;
    static int staticCounter = 0;


    public Counter(){

        normalCounter++;
        staticCounter++;

        System.out.println("normal counter = " + normalCounter);
        System.out.println("static counter = " + staticCounter);
    }

}
