package org.example.polymorphism.abstractClassandmethods;

public class AbsMain {
    public static void main(String[] args) {
        AnimalAbstract cat1=new Cat();
        System.out.println("AnimalAbstract cat1 ");
        cat1.sound();
        cat1.sleep();
        System.out.println("Cat cat2");
        Cat cat2=new Cat();
        cat2.sound();
        cat2.sleep();
        System.out.println("Dog Dog");
        Dog dog1=new Dog();
        dog1.sound();
        dog1.sleep();
        System.out.println("animal dog");
        AnimalAbstract dog2=new Dog();
        dog2.sound();
        dog2.sleep();

    }
}
