package org.example.collections;

import java.io.Serializable;
import java.util.Comparator;
import java.util.*;

public class ComparatorExampleDemo {

    public static void main(String[] args) {
/*Comparable  Natural ;

        Serializable*/


        Comparator comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i>j)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> list = new ArrayList<>();

        list.add(29);
        list.add(17);
        list.add(19);
        list.add(21);
        list.add(23);


        Collections.sort(list, comp);
        System.out.println(list);




    }
}
