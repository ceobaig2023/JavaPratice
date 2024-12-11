package org.example.exceptionhandelling;

public class Arthemetic {
    public static void main(String[] args) {
        try{
            int a=12 , b=0 ,c;
            c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally gets executed even if try catch fail");
        }
    }
}
