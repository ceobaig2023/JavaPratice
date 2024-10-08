package org.example.exceptionhandelling;

import java.io.FileReader;

public class IOExceptionExample {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("input.txt");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
