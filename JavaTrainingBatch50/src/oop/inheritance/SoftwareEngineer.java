package oop.inheritance;

public class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String name, char gender, int age, float tall,
            int id, int yearsOfExperience, int salary,
                            String major, int bonus){

        super(name, gender, age, tall, id, yearsOfExperience, salary);

        this.major = major;
        this.bonus = bonus;
    }

    public String major;
    public int bonus;

}
