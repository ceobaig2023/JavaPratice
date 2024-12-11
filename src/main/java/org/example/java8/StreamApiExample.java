package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
        return name + " (" + age + ")";
    }
}

public class StreamApiExample {
    public static void main(String[] args) {
        // Sample list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("David", 20),
                new Person("Eve", 40)
        );

        // 1. filter() - Get people older than 25
        List<Person> filtered = people.stream()
                .filter(p -> p.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println("People older than 25: " + filtered);

        // 2. map() - Get names of the people
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names of people: " + names);

        // 3. flatMap() - Flatten a list of lists of names (just for demonstration)
        List<List<String>> nameLists = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Eve")
        );
        List<String> flattenedNames = nameLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened Names: " + flattenedNames);

        // 4. distinct() - Get unique ages
        List<Integer> uniqueAges = people.stream()
                .map(Person::getAge)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Ages: " + uniqueAges);

        // 5. sorted() - Sort people by age
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by Age: " + sortedByAge);

        // 6. peek() - Print ages while processing
        List<Integer> agesWithPeek = people.stream()
                .peek(p -> System.out.println("Processing: " + p))
                .map(Person::getAge)
                .collect(Collectors.toList());
        System.out.println("Ages with Peek: " + agesWithPeek);

        // 7. limit() - Get first 3 people
        List<Person> firstThree = people.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("First three people: " + firstThree);

        // 8. skip() - Skip the first person
        List<Person> skippedFirst = people.stream()
                .skip(1)
                .collect(Collectors.toList());
        System.out.println("Skipped first person: " + skippedFirst);

        // 9. forEach() - Print each person
        System.out.println("All people:");
        people.stream().forEach(System.out::println);

        // 10. reduce() - Find the oldest person
        Optional<Person> oldest = people.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);
        oldest.ifPresent(person -> System.out.println("Oldest Person: " + person));

        // 11. collect() - Collect names into a Set
        Set<String> nameSet = people.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println("Names Set: " + nameSet);

        // 12. anyMatch() - Check if any person is younger than 25
        boolean hasYoungerThan25 = people.stream()
                .anyMatch(p -> p.getAge() < 25);
        System.out.println("Any person younger than 25? " + hasYoungerThan25);

        // 13. allMatch() - Check if all people are older than 18
        boolean allOlderThan18 = people.stream()
                .allMatch(p -> p.getAge() > 18);
        System.out.println("All people older than 18? " + allOlderThan18);

        // 14. noneMatch() - Check if no person is named "Alice"
        boolean noneNamedAlice = people.stream()
                .noneMatch(p -> p.getName().equals("Alice"));
        System.out.println("No one named Alice? " + noneNamedAlice);

        // 15. findFirst() - Find the first person
        Optional<Person> firstPerson = people.stream()
                .findFirst();
        firstPerson.ifPresent(person -> System.out.println("First person: " + person));

        // 16. findAny() - Find any person
        Optional<Person> anyPerson = people.stream()
                .findAny();
        anyPerson.ifPresent(person -> System.out.println("Any person: " + person));

        // 17. count() - Count the number of people
        long count = people.stream().count();
        System.out.println("Count of people: " + count);

        // 18. min() - Find the youngest person
        Optional<Person> youngest = people.stream()
                .min(Comparator.comparingInt(Person::getAge));
        youngest.ifPresent(person -> System.out.println("Youngest Person: " + person));

        // 19. max() - Find the oldest person
        Optional<Person> oldestUsingMax = people.stream()
                .max(Comparator.comparingInt(Person::getAge));
        oldestUsingMax.ifPresent(person -> System.out.println("Oldest Person using max: " + person));

        // 20. parallel() - Parallel processing example (not usually useful without a specific task)
        List<Person> parallelProcessed = people.parallelStream()
                .filter(p -> p.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println("People older than 25 (parallel): " + parallelProcessed);
    }
}
