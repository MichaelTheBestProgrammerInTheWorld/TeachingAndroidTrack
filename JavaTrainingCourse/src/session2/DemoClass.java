package session2;


public class DemoClass {


    static String name, job;

    public static void main(String[] args){

        name = "Bahy";
        job = "programmer";

        int age = 28;

        System.out.println("I am " + name);
        System.out.println("I am a " + job);
        System.out.print("I am " + age);

        System.out.print(name );


    }


    void display(){

        System.out.println("I am " + name);
        System.out.print("I am a " + job);
    }
}