package oop.inheritance;

public class Programmer extends Employee {

    int bonus = 10000;

    public Programmer(int yob, String phoneNum) {
        super(yob, phoneNum);
    }

    int getBonus(){
        return bonus;
    }

}
