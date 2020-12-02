package oop.polimorphism;

public class PolMain {

    public static void main(String[] args) {

//        AddNums addNums = new AddNums();
//        System.out.println(addNums.add(1, 9));
//        System.out.println(addNums.add(1, 3, 5, 7));
//        System.out.println(addNums.add(2, 4, 8));
//
//        SubtractNums subtractNums = new SubtractNums();
//        System.out.println(subtractNums.sub(6, 1));
//        System.out.println(subtractNums.sub(9.7f, 6.2f));
//
//        System.out.println(5);
//        System.out.println("hbvbv");
//        System.out.println(5.5f);
//        System.out.println('m');

        Animal animal = new Animal();
        animal.move(20);

        Turtle turtle = new Turtle();
        turtle.move(15);
        turtle.move(5);

        Animal animal1 = new Turtle();
        animal1.move(15);

    }
}
