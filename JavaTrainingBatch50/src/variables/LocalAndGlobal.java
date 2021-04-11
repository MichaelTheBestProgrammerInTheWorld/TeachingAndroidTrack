package variables;

public class LocalAndGlobal {

    static int globalNumber;

    public static void main(String[] args) {

        int number = 100, num2 = 200;
        int number2 =200;
        System.out.println(number);
        //System.out.println(num2);
        globalNumber = 250;
        System.out.println(globalNumber);
        System.out.println(num2);
    }

    void display(){

        byte num2 = 50;
        //System.out.println(number);
        System.out.println(num2);
        globalNumber = 500;
        System.out.println(globalNumber);
    }

    void tryGlobalNum(){

        System.out.println(globalNumber);
    }

}
