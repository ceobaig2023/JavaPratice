package org.example.polymorphism.extendsKeyword;

 public class VehicalCommonParent {

    private void start(){
        System.out.println("VehicalCommonParent start");
    }

    protected void stop(){
        System.out.println("VehicalCommonParent stop");
    }

    private void accelerate(){
        System.out.println("VehicalCommonParent accelerate");
    }

    private void brake(){
        System.out.println("VehicalCommonParent brake");
    }

    public void move(){
        start();
        accelerate();
        stop();
        brake();
    }

    public void moveWithBrake(){
        start();
        accelerate();
        brake();
        stop();
    }

    public void moveWithAccelerate(){
        start();
        accelerate();
        stop();
    }


}
