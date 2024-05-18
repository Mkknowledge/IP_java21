package lambdas;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class test {

    public static void boundMethodReferences() {
        String name = "Mayur Kandalkar";

        Supplier<String> lowerL = () -> name.toLowerCase();
        Supplier<String> lowerMR = name::toLowerCase;

        System.out.println(lowerL.get());
        System.out.println(lowerMR.get());
    }

    public static void main(String[] args) {
        boundMethodReferences();

        int x = 7;
        System.out.println("x is even? -> " + check(x, i -> i % 2 == 0));
        String name = "Amazon is a small company.";
        System.out.println("Does name contains big -> " + check(name, i -> i.contains("big")));
    }

    public static <T> boolean check(T t, Predicate<T> lambda){
        return lambda.test(t);
    }
}
