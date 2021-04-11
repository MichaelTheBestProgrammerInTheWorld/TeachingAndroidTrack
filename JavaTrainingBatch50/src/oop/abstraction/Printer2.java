package oop.abstraction;

public class Printer2 implements Printable {

    @Override
    public void print() {

        System.out.println("this is second printer");
    }

    @Override
    public void running() {
        System.out.println("running");
    }

    @Override
    public void multiple() {
        System.out.println("multiple");
    }
}
