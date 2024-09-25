package org.example.java8;

import java.util.*;
import java.util.stream.Collectors;


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

        System.out.println("Distinct");


         nums1.stream().distinct().forEach(System.out::println);

        System.out.println("sum");

        int j=nums1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(j);

        List<String> str2=Arrays.asList("a","b","c","d");
        String concatenated = str2.stream().collect(Collectors.joining(","));
        System.out.println(concatenated);

        List<String> emp=Arrays.asList("Mirza","Affan5","Abid","Umair7777");
        Map<Integer,List<String>> emp1=emp.stream().collect(Collectors.groupingBy(s->s.length()));
        System.out.println(emp1);



        //13

        List<String> p1=Arrays.asList("Mirza","Affan","Afreedii","Asif");
        List<Integer> page=Arrays.asList(22,44,25,33);








    }
}

