package loops;

public class DoWhileEx {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        System.out.println("program starts");

        //minimum number of execution is zero
        while (i<10){
            System.out.println("while i = " + i);
            i++;
        }

        //minimum number of execution is 1
        do {
            System.out.println("do while j = " + j);
            j++;
        }while (j<10);

        System.out.println("program ends");
    }
}
