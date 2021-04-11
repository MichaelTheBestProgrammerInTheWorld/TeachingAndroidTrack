package oop.polymorphism;

public class MainPoly {

    public static void main(String[] args) {

        //overloading examples
//        AddingProgram program = new AddingProgram();
//        System.out.println(program.add(5, 8, 12));
//        System.out.println(program.add(5, 6, 7, 8));
//        System.out.println(program.add(10, 20));
//
//        SubtractProgram subtractProgram = new SubtractProgram();
//        System.out.println(subtractProgram.sub(8, 5));
//        System.out.println(subtractProgram.sub(8.5f, 5.9f));


        //overriding examples
        Turtle turtle = new Turtle();
        turtle.move();
        Wolf wolf = new Wolf();
        wolf.move();
    }
}
