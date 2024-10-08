package org.example.exceptionhandelling;

public class TryCatchE {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        try{
            System.out.println(arr1[7]);
        }catch (Exception e){
            System.out.println("Index Out of Bond Exception: "+e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}
