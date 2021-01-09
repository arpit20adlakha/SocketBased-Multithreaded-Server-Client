package jdbc;

import java.util.function.Function;
import java.util.function.IntPredicate;

public class ComposingFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

        System.out.println("result:" + adder.compose(multiplier).apply(5));

        System.out.println("result:" + adder.andThen(multiplier).apply(5));

        IntPredicate isOdd = n -> n % 2 != 0;

        System.out.println(isOdd.test(10));
        System.out.println(isOdd.test(11));

        IntPredicate lessThan11 = n -> n < 11;

        System.out.println(lessThan11.test(10));
        System.out.println(lessThan11.test(11));

        IntPredicate isEven = isOdd.negate();

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
        System.out.println(Math.random() * 3);
    }
}
