package Imperative;

import java.util.List;
import   java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {

        List<Person> people  = List.of(
                new Person("Yunus", Gender.Male),
                new Person("Shilfan", Gender.Female),
                new Person("Fairoja", Gender.Female),
                new Person("Ansari", Gender.Male)
        );

        //Funtional Approach
        Predicate<Person> personPredicate = person -> Gender.Female.equals(person.gender);

        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.gender = gender;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name: "+this.name+" Gender: "+this.gender;
        }
    }

    enum Gender {
        Male, Female
    }
}