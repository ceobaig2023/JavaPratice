package org.example.java8;
import java.util.*;
public class StreamAPIexample123 {

    public static void main(String[] args) {

        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);


       // nums.forEach(n-> System.out.println(n));
        nums.forEach(System.out::println);


       /* for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }


        int sum=0;
        for(int n : nums){
            if(n%2==0){
                System.out.println(n);
                sum=sum+n;
                System.out.println(sum);
            }
        }
*/


    }
}
