package org.example.java8;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LambdaPractice {
    public static void main(String[] args) {
        // 1. Runnable
        Runnable runnable= () ->System.out.println("Running");

        runnable.run();
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9);
        numbers.sort((o1, o2) -> o1.compareTo(o2));  // Simplified with lambda

        System.out.println(numbers);

        // 3. Predicate (check if a number is even)
        Predicate<Integer> isEven=n ->n % 2 == 0;

        System.out.println(isEven.test(4));

        // 4. Function (square a number)
        Function<Integer, Integer> square = (n)-> n * n;


        System.out.println(square.apply(5));

        // 5. Consumer (print a string)
        Consumer<String> printString = (s) ->System.out.println(s);

        printString.accept("Hello");

        // 6. Supplier (get current time in milliseconds)
        Supplier<Long> currentTime =() -> System.currentTimeMillis();

        System.out.println(currentTime.get());

        // 7. BiFunction (concatenate two strings)
        BiFunction<String, String, String> concatenate = (s1,s2)->s1+s2;

        System.out.println(concatenate.apply("Hello, ", "World!"));

        // 8. UnaryOperator (increment a number by 1)
        UnaryOperator<Integer> increment =(n) -> n + 1;

        System.out.println(increment.apply(10));

        // 9. BinaryOperator (find the maximum of two numbers)
        BinaryOperator<Integer> max =(a,b) ->a > b ? a : b;

        System.out.println(max.apply(10, 20));

        // 10. Stream filter (filter out odd numbers)
        List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evens);
    }
}

