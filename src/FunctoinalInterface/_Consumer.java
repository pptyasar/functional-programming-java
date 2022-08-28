package FunctoinalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Yunus","5910533639"));

        //Consumer - Functional Interface
        greetCustomerConumer.accept(new Customer("Shilfan","7418304526"));

        sendOTPToCustomer(new Customer("Yasar","8903713957"),192828);

        //BiConsumer
        otpSentMessageBiConsumer.accept(new Customer("Fairoja","9942023784"),120876);
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hi " + customer.customerName+", \n To verify enter OTP which is send to phone number "+customer.customerPhoneNumber);
    }

    static void sendOTPToCustomer(Customer customer, Integer otp){
        System.out.println("Hi " + customer.customerName+", \n You OTP is "+otp);

    }

    static Consumer<Customer> greetCustomerConumer  = customer -> System.out.println("Hi " + customer.customerName+", \n To verify enter OTP which is send to phone number "+customer.customerPhoneNumber);

    static BiConsumer<Customer,Integer>  otpSentMessageBiConsumer = (customer,otp) ->  System.out.println("Hi " + customer.customerName+", \n You OTP is "+otp);
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName,String customerPhoneNumber){
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
