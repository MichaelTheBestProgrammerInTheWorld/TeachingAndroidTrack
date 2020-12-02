package loops;

public class LoopWithBreak {

    public static void main(String[] args) {


        esraa:
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3;j++){
                if (i == 2 && j == 2){
                    break esraa;
                }
                System.out.println("i = " + i + " j = " + j);
            }

        }
    }
}
