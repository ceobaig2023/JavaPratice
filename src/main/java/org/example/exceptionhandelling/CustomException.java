package org.example.exceptionhandelling;

class CustomizedException extends Exception{
   public CustomizedException(String message) {
        super(message);
    }
}
public class CustomException extends Exception {



    public static void main(String[] args) {
        try{
            int i = 10/0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void


}

