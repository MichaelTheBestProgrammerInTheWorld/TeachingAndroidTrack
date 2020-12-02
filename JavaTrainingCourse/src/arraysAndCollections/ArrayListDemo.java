package arraysAndCollections;

import oop.encapsulationEx.Student;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ahmed");
        arrayList.add("Bahy");
        arrayList.add("Noha");
        arrayList.add("Heshmat");
        arrayList.add("Esraa");

        System.out.println(arrayList);

        for (int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.get(1));

        for (String name : arrayList){
            System.out.println(name);
        }

        arrayList.set(3, "Michael");
        arrayList.remove(4);

        System.out.println(arrayList);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(arrayList);
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(3);
        numbers.add(27);
        numbers.add(5);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(names);
        System.out.println(names);

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("esraa");
        student.setAge(15);
        student.setGrade(5);
        students.add(student);

        Student esraaObj = students.get(0);

        System.out.println(students.get(0).getName());
        System.out.println("name is " + esraaObj.getName() +
                " age is " + esraaObj.getAge() +
                " grade is " + esraaObj.getGrade());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println(integers);


    }
}
