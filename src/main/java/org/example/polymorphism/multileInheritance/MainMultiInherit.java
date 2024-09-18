package org.example.polymorphism.multileInheritance;

// Interface 1
interface Drivable {
    void drive();
}

// Interface 2
interface Flyable {
    void fly();
}

// Class that implements multiple interfaces
class FlyingCar implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("Flying car is driving on the road");
    }

    @Override
    public void fly() {
        System.out.println("Flying car is flying in the sky");
    }
}

// Main class to test
public class MainMultiInherit {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.drive();  // Calls drive() from Drivable
        myFlyingCar.fly();    // Calls fly() from Flyable
    }
}

//Multi Inheritance is chiled in java through Interface