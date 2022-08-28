package FunctoinalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment = incrementByOne(1);
        System.out.println("increment = " + increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println("i = " + increment2);

        //Apply
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("multiply10Function = " + multiply);

        //AndThan
        Function<Integer, Integer> addByOneAndThanMulti10 = incrementByOneFunction.andThen(multiplyBy10Function);
        Integer addMutiResult = addByOneAndThanMulti10.apply(4);
        System.out.println("addMutiResult = " + addMutiResult);

        //
        int incMultiResult = incrementByOneAndMultiply(4, 100);
        System.out.println("incMultiResult = " + incMultiResult);

        //BiFunction
        Integer incremtnMultiBiResult = incrementByOneMultiBiFunction.apply(4, 100);
        System.out.println("incremtnMultiBiResult = " + incremtnMultiBiResult);
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;
    static  int incrementByOne(int number){
        return number+1;
    }

    static BiFunction<Integer,Integer,Integer>   incrementByOneMultiBiFunction = (numberToIncrementByOne,numberToMultiply) -> (numberToIncrementByOne+1) * numberToMultiply;

    static  int incrementByOneAndMultiply(int number,int numberToMultiply){
        return (number+1) * numberToMultiply;
    }
}
