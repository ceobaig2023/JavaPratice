package org.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamApiSelfPratice {
    public static void main(String[] args) {


        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,11,22,33);

        l1.stream().map(n->n*n).forEach(System.out::println);
        l1.stream().map(n->n*n).forEach(System.out::println);

    }
}
