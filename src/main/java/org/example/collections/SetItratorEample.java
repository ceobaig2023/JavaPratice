package org.example.collections;

import java.util.*;

public class SetItratorEample {

    public static void main(String[] args) {

        Collection<Integer> list = new HashSet<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);


        Set<Integer> set = new HashSet<Integer>();

        set.add(19);
        set.add(19);
        set.add(39);
        set.add(49);
        set.add(59);
        set.add(69);
        set.add(79);
        set.add(89);


        System.out.println(set);





        Set<Integer> set1 = new TreeSet<Integer>();

        set1.add(19);
        set1.add(19);
        set1.add(39);
        set1.add(49);


        System.out.println(set1);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }

}
