package org.example.exceptionhandelling;

public class ThrowKeyword {

    public static void main(String[] args) {
        try{
            ageValidation(15);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void ageValidation(int age){
        if(age<18){
            throw new IllegalArgumentException("Person is not eligible to vote");
        }else{
            System.out.println("Person is eligible to vote");
        }
    }
}
