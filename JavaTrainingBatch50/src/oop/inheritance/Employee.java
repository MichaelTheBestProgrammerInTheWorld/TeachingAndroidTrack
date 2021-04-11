package oop.inheritance;

import oop.Person;

public class Employee extends Person {


    public int id;
    public int yearsOfExperience;
    public int salary;

    public Employee(String name, char gender, int age, float tall,
            int id, int yearsOfExperience, int salary){

        super(name, gender, age, tall);

        this.id = id;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
}
