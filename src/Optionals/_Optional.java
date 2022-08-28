package Optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseGet(()->"Default Value");
        System.out.println("value = " + value);


        Optional.ofNullable(null)
                .ifPresent( val-> System.out.println("Send "+val));


        Optional.ofNullable(null)
                .ifPresentOrElse( val-> System.out.println("Send "+val),
                        ()->{
                            System.out.println("Cannot get val");
                        });

//        Supplier<IllegalStateException> illegalStateExceptionSupplier = () -> new IllegalStateException("Hurray!!");
//        Object value2 = Optional.ofNullable(null)
//                .orElseThrow(illegalStateExceptionSupplier);
//        System.out.println("value2 = " + value2);
    }
}
