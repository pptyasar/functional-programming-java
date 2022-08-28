package Imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people  = List.of(
                new Person("Yunus", Gender.Male),
                new Person("Shilfan", Gender.Female),
                new Person("Fairoja", Gender.Female),
                new Person("Ansari", Gender.Male)
        );

        //Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person:people){
                if (Gender.Female.equals(person.gender)){
                    females.add(person);
                }
        }

        for (Person person:females){
            System.out.println("Name: "+ person.name);
        }

        //Declarative Approach
        people.stream()
                .filter(person -> person.gender.equals(Gender.Female))
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