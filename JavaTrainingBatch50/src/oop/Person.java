package oop;

public class Person {

    //state
    String name;
    char gender;
    int age;
    static String job = "Software Engineer";
    float tall;

    //constructor
     public Person(String name, char gender, int age, float tall){
        System.out.println("constructor is called");
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tall = tall;
    }

    //behavior
    void eat(){
        System.out.println(name + " is eating");
    }

    void drink(){
        System.out.println(name + " is drinking");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }

    void walk(){
        System.out.println(name + " is walking");
    }

    int calculateAge(int currentYear, int yob){

        int age = currentYear - yob;
        return age;
    }

    String setName(String name){
        this.name = name;
        return name;
    }

    void work(){
        System.out.println("I am a " + job);
    }
}
