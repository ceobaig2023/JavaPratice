package org.example.polymorphism.abstractClassandmethods;

public class Cat extends AnimalAbstract{

    @Override
    public void sound() {
        System.out.println("Meow");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
