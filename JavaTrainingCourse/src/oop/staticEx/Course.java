package oop.staticEx;

public class Course {

    String name;
    int noOfStudents;
    int duration, time;
    String instructorName;
    static String collegeName = "YAT";

    public Course(String name, int noOfStudents, int duration,
                  int time, String instructorName){

        this.name = name;
        this.noOfStudents = noOfStudents;
        this.duration = duration;
        this.time = time;
        this.instructorName = instructorName;


        System.out.println("Course Info : ");
        System.out.println("Course name : " + name);
        System.out.println("number of students : " + noOfStudents);
        System.out.println("Course duration : " + duration);
        System.out.println("Course time : " + time);
        System.out.println("Instructor name : " + instructorName);
        System.out.println("College name : " + collegeName);
    }
}
