package org.example.polymorphism.extendsKeyword;

public class CarChild extends VehicalCommonParent  {

    @Override
    public void stop(){
        System.out.println("Car stop");
    }



    public static void main(String[] args) {
        CarChild car = new CarChild();
        //car.start();   private method can't be accessed
        car.move();
        car.moveWithBrake();
        car.moveWithAccelerate();
        car.stop();   //protected and public can be accessed

        VehicalCommonParent v1=new CarChild();
        System.out.println("Class Type of Reference Variable  +Reference Variable=Object Creation Keyword +Constructor Call");
        System.out.println("---------parent accessing child class----------");
        v1.stop();
        v1.move();



    }
}
