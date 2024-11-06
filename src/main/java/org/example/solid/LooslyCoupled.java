package org.example.solid;

interface Engine{

    void start();
}

class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrool Engine started");
    }
}

class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }
}
class Car1{
    private Engine engine;

    public Car1(Engine engine) {
        this.engine = engine;
    }

    public void startcar() {
        engine.start();
        System.out.println("Car started");
    }



}
public class LooslyCoupled {
    public static void main(String[] args) {

        Engine petrol=new PetrolEngine();
        Car1 c=new Car1(petrol);
        c.startcar();

        Engine desil=new DieselEngine();
        Car1 c1=new Car1(desil);
        c1.startcar();
    }
}
