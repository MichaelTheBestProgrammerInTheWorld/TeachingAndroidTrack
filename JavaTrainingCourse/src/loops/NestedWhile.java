package loops;

public class NestedWhile {

    public static void main(String[] args) {

        int i = 1;

        while (i<=10){

            int j = 1;

            System.out.println("i = " + i);
            i++;

            while (j<=10){

                System.out.println("j = " + j);

                j++;
            }
        }

        System.out.println("program ends");
    }
}
