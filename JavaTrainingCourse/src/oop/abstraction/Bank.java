package oop.abstraction;

public abstract class Bank extends Square implements Printable, Drawable{

    abstract int getRateOfInterest();

    void getBalane(){
        System.out.println("balance");
    }

    @Override
    public void play() {

    }

    @Override
    public void draw() {
        System.out.println("I am implementing 2 interfaces");
    }
}
