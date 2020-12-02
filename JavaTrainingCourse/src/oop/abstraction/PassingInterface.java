package oop.abstraction;

public class PassingInterface {


    Esraa esraa;

    PassingInterface(Esraa esraa){
        this.esraa = esraa;
    }

    void speaking(){
        esraa.speak();
    }

    interface Esraa {

        void speak();
    }
}
