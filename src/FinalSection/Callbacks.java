package FinalSection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        hello("Yunus",null,value->{
            System.out.println("No lastname provided for "+value);
        });

        hello2("Yunus",null,()->{
            System.out.println("No lastname provided for ");
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback){
        System.out.println("firstName = " + firstName);
        if (lastName != null){
            System.out.println("lastName = " + lastName);
        }else{
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback){
        System.out.println("firstName = " + firstName);
        if (lastName != null){
            System.out.println("lastName = " + lastName);
        }else{
            callback.run();
        }
    }

//    Javascript
//    function hello(firstName,lastName,callback){
//        console.log(firstName);
//        if(lastName){
//            console.log(lastName);
//        }else{
//            callback();
//        }
//    }

}
