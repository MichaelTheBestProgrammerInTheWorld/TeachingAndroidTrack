package oop.abstraction;

public class Square extends Shape implements Drawable {

    int l;


    public void setL(int l) {
        this.l = l;
    }

    @Override   //annotation
    int calculateArea() {
        return l*l;
    }

    @Override
    public void draw() {
        System.out.println("this class is drawing square");
    }
}
