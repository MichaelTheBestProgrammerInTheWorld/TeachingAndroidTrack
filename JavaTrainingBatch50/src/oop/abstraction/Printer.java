package oop.abstraction;

public class Printer implements Printable, ThirdInterface {

    @Override
    public void print() {

        System.out.println("printing");
    }

    @Override
    public void running() {
        System.out.println("running");
    }

    @Override
    public void trying() {
        System.out.println("trying");
    }

    @Override
    public void multiple() {
        System.out.println("multiple");
    }
}
