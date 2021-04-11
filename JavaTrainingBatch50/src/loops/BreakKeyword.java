package loops;

public class BreakKeyword {

    public static void main(String[] args) {
        int j, i;
        outer:
        for (i=1; i<=3; i++){

            inner:
            for (j=1; j<=3; j++){

                if (i==2 && j==2){
                    System.out.println("break is executed");
                    break outer;
                }

                System.out.println("i= " + i + " j= " + j);
            }


        }
    }
}
