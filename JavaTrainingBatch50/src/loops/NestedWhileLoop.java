package loops;

public class NestedWhileLoop {

    public static void main(String[] args) {

        int i = 1;

        while (i<=10){

            System.out.println("i= " + i);
            i++;

            int j = 1;
            while (j<=10){

                System.out.println("j= " + j);
                j++;
            }

            System.out.println("End of round in outer while loop");
        }
    }
}
