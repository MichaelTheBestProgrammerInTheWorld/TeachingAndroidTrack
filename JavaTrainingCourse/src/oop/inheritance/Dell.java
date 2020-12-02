package oop.inheritance;

public class Dell extends Computer {

    int model;

    Dell(String name, int price, int model){
        super(name, price);
        this.model = model;

    }

    public int getModel() {
        return model;
    }

}
