package loops;

public class NestedForLoop {

    public static void main(String[] args) {

        outerLoop:
        for (int i=1; i<4; i++){

            innerLoop:
            for (int j=1; j<4; j++){

                System.out.println("i=" + i + " j=" + j);
            }
            System.out.println("End of outer loop");

        }

        System.out.println("End of program");
    }
}
