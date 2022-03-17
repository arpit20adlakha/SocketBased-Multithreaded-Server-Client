package concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionCurrying {
    String name;
    Integer value;

    public FunctionCurrying(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        IntBinaryOperator sumOfSquares = sumF(x -> x * x);
        long sum = sumOfSquares.applyAsInt(5, 10);
        System.out.println(sum);

        long sumOfIndentities = sumF(x -> x).applyAsInt(0, 10);

        long sumWithCofficient = sumF(x -> x * 2).applyAsInt(10, 11);

        long sumOfCubes = sumF(x -> x * x * x).applyAsInt(3, 8);

        System.out.println(sumOfIndentities  + " " + sumWithCofficient + " " + sumOfCubes);

        IntBinaryOperator notCurriedFun = (x, y) -> x + y;

        IntFunction<IntUnaryOperator> curriedFun = x -> y -> x + y; // a curried function


        IntFunction<IntFunction<IntFunction<Integer>>> fff = x -> y -> z -> x * y + z;

        IntFunction<IntFunction<Integer>> ff = fff.apply(2);

        IntFunction<Integer> f = ff.apply(3);

        int result = f.apply(1);

        int anotherResult = fff.apply(10).apply(15).apply(3);

        Function<IntUnaryOperator, IntBinaryOperator> sumF = (t) -> (a, b) -> t.applyAsInt(a) + t.applyAsInt(b);

        IntBinaryOperator sumOfSquares1 = sumF.apply(x -> x * x);
        long sum1 = sumOfSquares1.applyAsInt(5, 10);


        Function<String, Consumer<String>> say = what -> who -> System.out.println(what + ", " + who);

        List<String> friends = Arrays.asList("John", "Neal", "Natasha");
        Consumer<String> sayHi = say.apply("Hi");

        friends.forEach(sayHi);

        Class object = Class.forName("FunctionCurrying");
        System.out.println(object.getConstructors());
        System.out.println(object.getFields());
        System.out.println(object.getMethods());

    }

    public static IntBinaryOperator sumF(IntUnaryOperator f) {
        return (a, b) -> f.applyAsInt(a) + f.applyAsInt(b);
    }


}
