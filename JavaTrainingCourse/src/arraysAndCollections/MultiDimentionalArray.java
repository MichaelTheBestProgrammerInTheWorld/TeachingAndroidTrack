package arraysAndCollections;

public class MultiDimentionalArray {


    public static void main(String[] args) {

        int[][] phone = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int[][] multi1 = new int[3][4];
        multi1[0][0] = 1;
        multi1[0][1] = 2;
        multi1[0][2] = 3;
        multi1[0][3] = 4;
        multi1[1][0] = 5;
        multi1[1][1] = 6;
        multi1[1][2] = 7;
        multi1[1][3] = 8;
        multi1[2][0] = 9;
        multi1[2][1] = 10;
        multi1[2][2] = 11;
        multi1[2][3] = 12;

        for (int i=0; i< 3; i++){
            for (int j=0; j<4; j++){
                System.out.println(phone[i][j]);
            }
        }

        for (int i=0; i< 3; i++){
            for (int j=0; j<4; j++){
                System.out.println(multi1[i][j]);
            }
        }

        try {
            multi1[3][3] = 12;
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("exception handled successfully");
    }
}
