package arraysAndCollections;

import oop.encapsulationEx.Student;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        String name1 =  "Ahmed";
        String name2 = "Noha";
        String name3 = "Heshmat";
        String name4 = "Esraa";

        String[] namesArray = new String[4];
        namesArray[0] = "Ahmed";
        namesArray[1] = "Noha";
        namesArray[2] = "Heshmat";
        namesArray[3] = "Esraa";

        System.out.println(namesArray.length);

        //simple for loop
        for (int i=0; i< namesArray.length; i++){
            System.out.println(namesArray[i]);
        }

        //for each loop
        for (String x : namesArray){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(namesArray));

        int[] numbers = {1, 2, 3, 4, 5, 5, 5};
        numbers[3] = 9;
        System.out.println(numbers[3]);
        for (int x : numbers){
            System.out.println(x);
        }

        int[] nums = numbers;
        System.out.println(nums[2]);

        Student[] students = new Student[1];
        Student student = new Student();
        student.setGrade(5);
        student.setAge(15);
        student.setName("Esraa");
        students[0] = student;
    }

}
