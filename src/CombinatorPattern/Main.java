package CombinatorPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Yunus","ayyu@nusgmail.com","8010533629", LocalDate.of(1994,1,22));

        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
        System.out.println(customerValidatorService.isValid(customer));

        //

        CustomerRegisterValidator.ValidationResult validationResult= CustomerRegisterValidator
                .isEmailValid()
                .and(CustomerRegisterValidator.isPhoneNumberValid())
                .and(CustomerRegisterValidator.isAnAdult())
                .apply(customer);

        System.out.println("validationResult = " + validationResult);
    }
}
