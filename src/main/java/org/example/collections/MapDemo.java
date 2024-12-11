package org.example.collections;
import java.util.*;
public class MapDemo {

    public static void main(String[] args) {
        //Map is a Interface  It has Key Value Pair

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Mirza",1);
        map.put("Umair",2);
        map.put("Ali",3);
        map.put("Ahmed",4);
        map.put("Ahmed",5);
        System.out.println(map);

        System.out.println(map.get("Mirza"));

        // Keys are Set values are List

        System.out.println(map.keySet());

        System.out.println(map.values());

        for(String key : map.keySet()){
            System.out.println("Marks of " +key +" is " +map.get(key));
        }

        Map<String,Integer> map1 = new Hashtable<String,Integer>();

        map1.put("Mirza",1);
        map1.put("Umair",2);
        map1.put("Ali",3);
        map1.put("Ahmed",4);
        map1.put("Ahmed",5);
        System.out.println(map1);

        //Hashtable is synchronised






    }
}
