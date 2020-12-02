package oop.encapsulationEx;

public class EncapMain {


    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("student name = " + student.getName());
        System.out.println("student age = " + student.getAge());
        System.out.println("student grade = " + student.getGrade());
    }
}
