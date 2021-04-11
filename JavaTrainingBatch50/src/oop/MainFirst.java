package oop;

import oop.inheritance.Employee;
import oop.inheritance.SoftwareEngineer;

public class MainFirst {

    public static void main(String[] args) {

        /*
        Person person1 = new Person("Mostafa", 'M',
                30, 180.8f);
        //person1.name = "Michael";
        //person1.job = "Software Engineer";



        person1.eat();
        person1.drink();
        person1.walk();
        person1.work();
        int i = person1.calculateAge(2012, 1990);
        int j = person1.calculateAge(2011, 1980);
        System.out.println(i);

        person1.setName("Ahmed");
        person1.eat();
        person1.drink();
        person1.walk();

        Person person2 = new Person("Mostafa", 'M',
                30, 180.8f);
        person2.eat();
        person2.drink();
        person2.walk();
        person2.work();




        StaticCounter staticCounter1 = new StaticCounter();
        StaticCounter staticCounter2 = new StaticCounter();
        StaticCounter staticCounter3 = new StaticCounter();
        StaticCounter staticCounter4 = new StaticCounter();
        StaticCounter staticCounter5 = new StaticCounter();

        System.out.println(staticCounter1.normalCounter);
        System.out.println(staticCounter1.normalCounter);
        System.out.println(staticCounter1.normalCounter);
        System.out.println(staticCounter1.normalCounter);
        System.out.println(staticCounter1.normalCounter);
        System.out.println(staticCounter1.normalCounter);

         */

        //Employee employee = new Employee(123, 3, 63);

        SoftwareEngineer eng = new SoftwareEngineer(
                "Badr",
                'M',
                30,
                170.9f,
                12345,
                5,
                50000,
                "Android",
                10000
        );
        int totalSalary = eng.salary + eng.bonus;
        System.out.println("Software Engineer details");
        System.out.println("ID is " + eng.id);
        System.out.println("major is " + eng.major);
        System.out.println("experience is " + eng.yearsOfExperience);
        System.out.println("total salary is " + totalSalary);
    }
}
