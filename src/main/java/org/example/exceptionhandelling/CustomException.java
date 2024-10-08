package org.example.exceptionhandelling;

public class CustomException {

    public static void main(String[] args) {
        try{
            int i = 10/0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}

