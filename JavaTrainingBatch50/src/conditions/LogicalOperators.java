package conditions;

public class LogicalOperators {


    public static void main(String[] args) {

        //boolean x = true , y = false;




        int b = 5, c = 15, d=15;

        System.out.println("AND operator");
        System.out.println(c==d && b!=c);  //true   //true   //true
        System.out.println(c>b && c>d);  //false  //false  //true
        System.out.println(d<c && b<d);  //false  //false  //false
        System.out.println(b>c && b>d);  //false  //true   //false


        System.out.println("OR operator");
        System.out.println(c==d || b!=c);  //true   //true   //true
        System.out.println(c>b || c>d);  //false  //false  //true
        System.out.println(d<c || b<d);  //false  //false  //false
        System.out.println(b>c || b>d);

        System.out.println("NOT operator");
        System.out.println(true);  //false  //false  //false
        System.out.println(false);
        System.out.println(!true);  //true   //true   //true
        System.out.println(!false);  //false  //false  //true

    }
}
