package Practice;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Functions
        System.out.println(toUpperCase.apply("yasar"));
        System.out.println(toUpperCaseAndAge.apply("yasar","23"));

        //Predicate
        System.out.println(checkIsValidEmail.test("atyasar@gmail.com"));
        System.out.println(checkIsValidEmail.test("atyasargmail.com"));
        System.out.println("checkIsValidEmailAndPhoneNumber: "+checkIsValidEmailAndPhoneNumber.test("atyasar@gmail.com","9010455672"));

        //Consumer
        helloGreet.accept("Yunus");
        helloGreetWithCity.accept("Yunus","Chennai");

        //Supplier
        System.out.println(supplierGreet.get());
    }
    static Function<String,String> toUpperCase = name -> name.toUpperCase();
    static BiFunction<String,String,String> toUpperCaseAndAge = (name, age) -> name.toUpperCase()+" age: "+age;
    static Predicate<String> checkIsValidEmail = emailId -> emailId.contains("@") && emailId.contains(".");
    static BiPredicate<String,String> checkIsValidEmailAndPhoneNumber = (emailId,phoneNumber) -> emailId.contains("@") && emailId.contains(".") && phoneNumber.matches("^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$");
    static Consumer<String> helloGreet = name -> System.out.println("Hello "+name+"!");
    static BiConsumer<String,String> helloGreetWithCity = (name,city) -> System.out.println("Hello "+name+"!, Welcome to "+city);
    static Supplier<String> supplierGreet = () -> "Hello World!!!";
}
