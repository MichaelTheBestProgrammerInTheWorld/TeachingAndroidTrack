package oop.abstraction;

public class Printing implements Printable {

    @Override
    public void print() {

        System.out.println("I am printing papers");
    }

    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void play() {
        System.out.println("I am playing");
    }
}
