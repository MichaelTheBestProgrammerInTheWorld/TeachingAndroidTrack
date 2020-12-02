package oop.abstraction;

public class Circle extends Shape implements Drawable {

    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return 13*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("this class is drawing circle");
    }
}
