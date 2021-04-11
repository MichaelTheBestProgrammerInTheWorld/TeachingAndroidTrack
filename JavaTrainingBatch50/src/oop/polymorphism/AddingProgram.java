package oop.polymorphism;

public class AddingProgram {

    //method overloading by changing number of parameters

    int add(int x, int y){
        return x+y;
    }

    int add(int x, int y, int z){
        return x+y+z;
    }

    int add(int x, int y, int z, int f){
        return x+y+z+f;
    }
}
