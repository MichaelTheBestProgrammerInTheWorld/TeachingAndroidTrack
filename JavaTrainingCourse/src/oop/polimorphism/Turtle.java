package oop.polimorphism;

public class Turtle extends Animal{


    @Override
    void move(int a) {
        if (a<10){
            super.move(a);
        } else {
            System.out.println("turtle can move but very slowly");
        }
    }

    void eat(){
        System.out.println("turtle is eating");
    }

}
