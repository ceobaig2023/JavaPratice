package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaToMethodReferencePractice {
    public static void main(String[] args) {
        // 1. Lambda to print each element of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        names.forEach(System.out::print);

        // 2. Lambda to check if a string starts with "A"
        Predicate<String> startsWithA ="A"::startsWith;
        System.out.println(startsWithA.test("Alice")); // true

        // 3. Lambda to convert a string to upper case
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("hello")); // HELLO

        // 4. Lambda to get the length of a string
        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("hello")); // 5

        // 5. Lambda to provide a new string (constructor reference)
        Supplier<String> stringSupplier = String::new;
        System.out.println(stringSupplier.get());
    }
}

