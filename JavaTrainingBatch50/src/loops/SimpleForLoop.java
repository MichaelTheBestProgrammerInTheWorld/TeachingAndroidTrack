package loops;

public class SimpleForLoop {

    public static void main(String[] args) {

        //without for loop
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        System.out.println("print from 1 to 10");

        for (int i=1; i<11; i++){

            System.out.println(i);
        }

        System.out.println("print odd numbers from 1 to 10");

        for (int i=1; i<11; i+=2){

            System.out.println(i);
        }

        System.out.println("print from 10 to 1");

        for (int i=10; i>0; i--){

            System.out.println(i);
        }
    }
}
