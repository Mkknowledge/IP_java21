package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class preDefinedFunctionalInterfaces01 {

    public static void main(String[] args) {
        System.out.println("<<<<< Predicate >>>>>");
        String name = "Mayur";
        Predicate<String> pre = s -> s.contains("r");
        System.out.println("Predicate --> " + pre.test(name));

        System.out.println("<<<<< BiPredicate >>>>>");
        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println("BiPredicate --> " + checkLength.test("New York", 7));

        System.out.println("<<<<< Consumer >>>>>");
        Consumer<String> capitalName = s -> System.out.println(s.toUpperCase());
        capitalName.accept("mayur kandalkar");

        System.out.println("<<<<< BiConsumer >>>>>");

        Map mapCapitalNames = new HashMap<String, String>();

        BiConsumer<String, String> populateMap = (key, value) ->
                mapCapitalNames.put(key, value);

        populateMap.accept("Delhi", "India");
        populateMap.accept("Dublin", "Ireland");
        populateMap.accept("Washington D. C.", "USA");

        BiConsumer<String, String> bicon = (cityName, countryName) ->
                System.out.println(cityName + " is the capital of " + countryName);

        mapCapitalNames.forEach(bicon);

        System.out.println("<<<<< Supplier >>>>>");

        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println("Supplier --> " + getRandomNumber.get());

        System.out.println("<<<<< Function >>>>>");

        Function<String, Integer> getLengthOfString = s -> s.length();

        System.out.println(getLengthOfString.apply("Mayur Kandalkar"));

        System.out.println("<<<<< BiFunction >>>>>");

        BiFunction<String, String, Integer> compareStrings = (s1, s2) -> s1.compareTo(s2);
        System.out.println("Bi Func --> " + compareStrings.apply("Mayur", "fdd"));

        BiFunction<String, String, String> concactStrings = (s3, s4) -> s3.concat(s4);
        System.out.println(concactStrings.apply("Mayur", " Bhavana"));

        System.out.println("<<<<< UnaryOperator >>>>>");

        UnaryOperator<String> yourName = nameww -> "My name is -> " + nameww;
        System.out.println(yourName.apply("Mayur"));


        System.out.println("<<<<< BinaryOperator >>>>>");

        BinaryOperator<String> yourFullName = (frstame , lastname) -> frstame.concat(lastname);
        System.out.println(yourFullName.apply("Mayur ", "Kandalkar"));

    }
}
