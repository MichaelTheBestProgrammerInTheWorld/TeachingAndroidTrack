package oop;

public class Calculator {

    int a, b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getDiv(){
        if (b != 0){
            return  a/b;
        } else {
            return 0;
        }
    }
}
