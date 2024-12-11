package org.example.java8;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaallFunctionsPratice {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Thread id running");
        Thread aj = new Thread(runnable);
        aj.start();

        List<String> sisters= Arrays.asList("Tamana","Samanta","Prianka","Sehah");
        Collections.sort(sisters,(a,b)->a.compareTo(b));
        System.out.println("Sisters in Order"+sisters);

        Predicate<Integer> isEven =x->x%2==0;
        List<Integer> number1=Arrays.asList(1,2,3,2,2,99,3,7,5,6,8,5,4);
        List<Integer> evenNumbers= number1.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);





    }
}
