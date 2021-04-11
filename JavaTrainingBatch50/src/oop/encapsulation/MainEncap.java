package oop.encapsulation;

public class MainEncap {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Ahmed");
        student.setAge(25);
        //student.setId(12345);
        student.setEmail("ahmed@gmail.com");
        student.setGender('M');
        student.setLevel(12);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getId());
        System.out.println(student.getEmail());
        System.out.println(student.getGender());
        System.out.println(student.getLevel());
    }
}
