package oop.abstraction;

public abstract class Bike implements ThirdInterface {

    abstract void run();

    void getSpeed(){
        System.out.println("Speed is unknown");
    }

    @Override
    public void trying() {
        System.out.println("trying");
    }
}
