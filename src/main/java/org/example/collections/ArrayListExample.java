package org.example.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create a new ArrayList to store String elements
        List<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Print the contents of the list
        System.out.println(list);


        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
