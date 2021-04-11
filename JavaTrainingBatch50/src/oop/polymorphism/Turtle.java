package oop.polymorphism;

public class Turtle extends Animal {

    int age = 30;

    @Override
    void move() {
        if (age<27){
            super.move();
        } else {
            System.out.println("turtle moves slowly");
        }
    }
}
