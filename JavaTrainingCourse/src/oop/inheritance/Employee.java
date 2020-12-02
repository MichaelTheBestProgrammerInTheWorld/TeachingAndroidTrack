package oop.inheritance;

import oop.Person;

public class Employee extends Person {

    int id;
    int salary = 50000;

    public Employee(int yob, String phoneNum) {
        super(yob, phoneNum);
    }

    int getSalary(){
        return salary;
    }
}
