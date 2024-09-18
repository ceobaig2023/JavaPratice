package org.example.polymorphism.implementsKeyword;

public class BMW implements VehicalInterface {

    @Override
    public void start() {
        System.out.println("BMW start");
    }

    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();

        VehicalInterface v1 = new BMW();
        System.out.println("Vehical interface of BMW class");
        v1.start();

    }
}
