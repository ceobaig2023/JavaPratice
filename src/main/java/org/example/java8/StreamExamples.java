package org.example.java8;

import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class StreamExamples {

    public static void main(String[] args) {

        // Task 1: Unique Elements
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        List<Integer> uniqueElements = numbers.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("Unique Elements: " + uniqueElements);

        // Task 2: Summing Elements
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of Elements: " + sum);


        // Task 3: Concatenating Strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String concatenated = strings.stream()
                .collect(Collectors.joining(","));
        System.out.println("Concatenated String: " + concatenated);

        // Task 4: Grouping by Length
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by Length: " + groupedByLength);

        // Task 5: Sorting in Descending Order
        List<Integer> sortedList = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in Descending Order: " + sortedList);

        // Task 6: Mapping to Objects
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> ages = Arrays.asList(30, 25, 35);
        List<Person> personList = IntStream.range(0, names.size())
                .mapToObj(i -> new Person(names.get(i), ages.get(i)))
                .collect(Collectors.toList());
        System.out.println("Person List: " + personList);

        // Task 7: FlatMap Usage
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        // Task 8: Partitioning
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));

        // Task 9: Statistics
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());

        // Task 10: Chaining Operations (Filter by age, Sort by name)
        List<Person> filteredSortedPersons = personList.stream()
                .filter(p -> p.getAge() > 18)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println("Filtered and Sorted Persons: " + filteredSortedPersons);
    }
}

