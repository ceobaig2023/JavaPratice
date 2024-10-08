package org.example.exceptionhandelling;

public class ThrowsKeyword {

    public static void main(String[] args) {
        try{
            ageValidation(15);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void ageValidation(int age) throws Exception{
        if(age < 18){
            throw new Exception("Age should be greater than 18");
        }
    }
}
