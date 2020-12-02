package oop;

public class Circle {

    double radius;

    Circle(){

        radius = 1.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    double getArea(){
        //area of circle = pi*radius*radius
        return 3.14*radius*radius;
    }
}
