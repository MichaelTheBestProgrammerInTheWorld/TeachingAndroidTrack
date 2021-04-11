package conditions;

public class ComparisonOperators {

    public static void main(String[] args) {

        int x = 10,  y = 5, z= 10;

        System.out.println(x==y); //false   //false
        System.out.println(x!=y); //true    //true
        System.out.println(x>y);  //true    //true
        System.out.println(x>=y);           //true
        System.out.println(x<y);  //false   //false
        System.out.println(x<=y); //false   //false

        System.out.println();

        System.out.println(x>=z); //true
        System.out.println(x>z);  //false
        System.out.println(x<=z); //true
        System.out.println(x<z);  //false
    }
}
