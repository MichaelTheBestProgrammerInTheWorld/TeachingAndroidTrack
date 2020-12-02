package oop.abstraction;

public class AbsMain {

    public static void main(String[] args) {

//        Bajaj bajaj = new Bajaj();
//        bajaj.highSpeed();

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.calculateArea());
        circle.draw();

        Square square = new Square();
        square.setL(10);
        System.out.println(square.calculateArea());
        square.draw();
//
//
//        QNB qnb = new QNB();
//        System.out.println("rate of interest in qnb is "
//        + qnb.getRateOfInterest());
//
        CIB cib = new CIB();
        System.out.println("rate of interest in cib is "
        + cib.getRateOfInterest());
        cib.getBalane();

        Printing printing = new Printing();
        printing.print();
        printing.run();
        printing.play();

        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("this is an object");
            }
        };

        drawable.draw();

        PassingInterface passingInterface =
                new PassingInterface(new PassingInterface.Esraa() {
                    @Override
                    public void speak() {
                        System.out.println("listen I am speaking to you");
                    }
                });

        passingInterface.speaking();
    }
}
