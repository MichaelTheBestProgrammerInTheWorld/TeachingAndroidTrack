package oop.encapsulationEx;

public class Student {

    private int id = 1234;
    private String name = "Mohammed";
    private int age = 18, grade = 12;

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
}
