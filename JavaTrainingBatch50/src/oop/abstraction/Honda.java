package oop.abstraction;

public class Honda extends Bike implements Printable {

    @Override
    void run() {
        System.out.println("honda bike is running");
    }

    @Override
    public void print() {
        System.out.println("printing in honda");
    }

    @Override
    public void running() {
        System.out.println("running");
    }

    @Override
    public void trying() {

    }

    @Override
    public void multiple() {
        System.out.println("multiple");
    }
}
