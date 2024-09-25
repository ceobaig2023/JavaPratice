package org.example.java8;

import java.util.*;


public class AfffanLamdaCallenge {


    public static void main(String[] args) {


        List<Integer> nums1 = Arrays.asList(2, 1, 3, 4, 3, 5, 7);

        System.out.println("Only Even Numbers");

        nums1.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("Square");

        nums1.stream().map(n->n*n).forEach(System.out::println);

        System.out.println("  Count ");

        int a =(int)nums1.stream().mapToInt(Integer::intValue).count();
        System.out.println(a);

        Optional b =nums1.stream().max(Integer::compareTo);

        System.out.println("Max valur"+b);

        List<String> str1=Arrays.asList("a","b","c","d");
        str1.stream().map(x->x.toUpperCase()).forEach(System.out::println);




    }
}
