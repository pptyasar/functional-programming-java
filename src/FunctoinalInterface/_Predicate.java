package FunctoinalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("010463639"));
        System.out.println(isPhoneNumberValid("9010533639"));

        //Predicate
        System.out.println(isPhoneNumberValidPredicate.test("7418304526"));
        System.out.println(isPhoneNumberValidPredicate.test("6010433249"));
        System.out.println(isPhoneNumberValidPredicate.test("9903713957"));


        //andThan
        System.out.println("Phone Number valid & contains number seven "+isPhoneNumberValidPredicate.and(containsNumber7).test("7010509632"));
        System.out.println("Phone Number valid & contains number seven "+isPhoneNumberValidPredicate.and(containsNumber7).test("9710533639"));


        System.out.println(isPhoneNumberValidAndValidCountryCode("9010533639","91"));

        //BiPredicate
        System.out.println(isPhoneNumberAndCountryCodeValidPredicate.test("9010533629","89"));

    }

    static  boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("9") && phoneNumber.length() == 10;
    }

    static  boolean isPhoneNumberValidAndValidCountryCode(String phoneNumber,String countryCode){
        return phoneNumber.startsWith("9") && phoneNumber.length() == 10 && countryCode.equals("91");
    }

    static  Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("9") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber7 = phoneNumber -> phoneNumber.contains("7");

    static BiPredicate<String,String> isPhoneNumberAndCountryCodeValidPredicate = (phoneNumber,countryCode) -> phoneNumber.startsWith("9") && phoneNumber.length() == 10 && countryCode.equals("91");

}
