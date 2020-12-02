package oop;

public class Car {

    String brand;
    String color;
    int yearOfProduction;
    int price;
    int speed;
    String countryOfOrigin;

    Car(String brand, String color, int yearOfProduction,
        int price, int speed, String countryOfOrigin){

        this.brand = brand;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.speed = speed;
        this.countryOfOrigin = countryOfOrigin;
    }

    void move(){
        System.out.println("this car is moving");
        System.out.println(brand +  " is moving");
    }

    String getColor(){
        return color;
    }

    void displayCarInfo(){
        System.out.println("brand is " + brand);
        System.out.println("Color is " + color);
        System.out.println("Year of production is " + yearOfProduction);
        System.out.println("Country of origin is " + countryOfOrigin);
    }

    int getPrice(){
        return price;
    }

    int getSpeed(){
        return speed;
    }

    boolean isCarNew(){
        if (yearOfProduction == 2020){
            return true;
        } else {
            return false;
        }
    }
}
