package loops;

public class NestedFor {


    public static void main(String[] args) {

        char x = ' ';
        int y = x;

        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.println(i + "  " + j);
            }
        }

        //System.out.println(y);
    }
}
