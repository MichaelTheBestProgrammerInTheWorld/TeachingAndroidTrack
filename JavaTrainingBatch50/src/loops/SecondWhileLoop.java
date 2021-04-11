package loops;

public class SecondWhileLoop {

    public static void main(String[] args) {

        boolean x = true;
        int i = 0;

        System.out.println("Start");

        while (x){

            System.out.println("we are in while loop");
            i++;
            if (i==25){
                x = false;
            }
        }

        System.out.println("End");
    }
}
