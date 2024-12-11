package org.example.collections;

import java.util.*;
import java.util.Collection;
import java.util.List;

public class CmparatorVsComparable {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(17);
        list.add(19);
        list.add(21);
        list.add(23);

        Collections.sort(list);
    }
}
