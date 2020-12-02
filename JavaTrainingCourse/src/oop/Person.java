package oop;

public class Person {

    public String name;
    String id;
    int yearOfBirth;
    public String address;
    String phoneNumber;

    public Person(int yob, String phoneNum){
        yearOfBirth = yob;
        System.out.println("year of birth is " + yearOfBirth);
    }

    void talk(){
        System.out.println("I am talking");
    }

    void walk(){
        System.out.println("I am walking");
    }

    void eat(){
        System.out.println("I am eating");
    }

    void drink(){
        System.out.println("I am drinking " + yearOfBirth);
    }

    int calculateAge(){
        //yearOfBirth = yob;
        int age = 2020 - yearOfBirth;
        return age;
    }
}
