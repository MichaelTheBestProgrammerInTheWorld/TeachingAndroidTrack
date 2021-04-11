package oop;

public class StaticCounter {

    int normalCounter = 0;
    static int staticCounter = 0;

    StaticCounter(){
        normalCounter++;
        staticCounter++;

        System.out.println("normal counter = " + normalCounter);
        System.out.println("static counter = " + staticCounter);
    }
}
