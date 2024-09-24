package org.example.collections;

import java.util.*;


public class CollectionsExample1 {

    public static void main(String[] args) {

        Collection<Integer> nums1= new ArrayList<Integer>();
        nums1.add(2);
        nums1.add(4);
        nums1.add(6);
        nums1.add(8);
        nums1.add(10);

        System.out.println(nums1);


        ArrayList<Integer> nums2= new ArrayList<Integer>();
        nums2.add(1);
        nums2.add(3);
        nums2.add(5);
        nums2.add(7);
        nums2.add(9);

        for(int n : nums2){    // Enhanced ForLoop
            System.out.println(n);
        }


        List<Integer> nums3= new ArrayList<Integer>();
        nums3.add(1);
        nums3.add(3);
        nums3.add(5);
        nums3.add(7);
        nums3.add(9);

        for(int i : nums3){    // Enhanced ForLoop
            System.out.println(i);
        }
        System.out.println(nums3.indexOf(3));
        System.out.println(nums3.get(2));





    }

}
