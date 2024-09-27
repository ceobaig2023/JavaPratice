package org.example.java8;

// Interface with a default method in Java 8
interface Vehicle {
    void startEngine();  // Abstract method (must be implemented by classes)

    // Default method (new feature in Java 8)
    default void honk() {
        System.out.println("Default honking...");
    }
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    // Car can optionally override the default method
    @Override
    public void honk() {
        System.out.println("Car is honking! Beep Beep!");
    }
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    // Bike uses the default honk method without overriding
}

public class DefaultMethodinJava8 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine(); // Car engine started
        car.honk();        // Car is honking! Beep Beep!

        Vehicle bike = new Bike();
        bike.startEngine(); // Bike engine started
        bike.honk();        // Default honking...
    }
}

