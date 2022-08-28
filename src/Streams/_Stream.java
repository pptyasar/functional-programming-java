package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people  = List.of(
                new Person("Yunus", Gender.MALE),
                new Person("Shilfan", Gender.FEMALE),
                new Person("Fairoja", Gender.FEMALE),
                new Person("Ansari", Gender.MALE),
                new Person("Xyz", Gender.PREFER_NOT_TO_SAY)
        );



        //Declarative Approach
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        Function<Person, String> personStringFunction = person -> person.name;

        people.stream()
//               .filter(person -> person.gender.equals(Gender.FEMALE))
                .map(personStringFunction)
                .mapToInt(length)
//                .collect(Collectors.toSet())
                .forEach(println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        System.out.println(people.stream()
                .anyMatch(personPredicate)
        );
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name: "+this.name+" Gender: "+this.gender;
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
