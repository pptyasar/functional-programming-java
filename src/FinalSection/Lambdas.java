package FinalSection;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Lambda - Function
        System.out.println(upperCaseName.apply("yunus"));
        //Lambda - BiFunction
        System.out.println(upperCaseNameAndAge.apply("yasar",23));

        //
    }


    static  Function<String,String> upperCaseName =  name -> {
        if (name.isBlank()) throw new IllegalStateException("Name is blank");
        return name.toUpperCase();
    };

    static BiFunction<String,Integer,String> upperCaseNameAndAge =  (name, age) -> {
        if (name.isBlank()) throw new IllegalStateException("Name is blank");
        System.out.println("age = " + age);
        return name.toUpperCase();
    };

}
