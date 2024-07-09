package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Streams03 {
    public static void main(String[] args) {

        System.out.println("<<<<<<<  Pipeline Example  >>>>>>>>>");

        List<Integer> numbers = Arrays.asList(51, 46, 76, 25, 77, 16, 21);
        System.out.println(" Count of Numbers > Fifty --> " + numbers.stream()
                .peek(System.out::println)
                .filter(s -> s > 50)
                .peek(System.out::println)
                .count());

        System.out.println("<<<<<<<  Stream Lazy Example  >>>>>>>>>");

        /*Stream.of("Mayur", "Bhavana", "Tashvi", "Krishita")
                .map(s -> {
                    System.out.println("Map --> " + s.);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch " + s);
                    return s.startsWith("T");
                });*/

        System.out.println("<<<<<  1. Creating a Stream from an Array >>>>>");

        Double[] nums = {1.2, 6.9, 7.7};
        Stream<Double> str1 = Arrays.stream(nums);
        System.out.println("No. of elements --> " + str1.count());

        System.out.println("<<<<<  2. Creating a Stream from a Collection >>>>>");

        List<String> animalList = Arrays.asList("Cat", "Dog", "Sheep");
        Stream<String> streamAnimals = animalList.stream();
        System.out.println("No. of Animals --> " + streamAnimals.count());

        Map<String, Integer> namesToAges = new HashMap<>();
        namesToAges.put("Bhavana", 30);
        namesToAges.put("Mayur", 32);
        namesToAges.put("Tashvi", 7);
        namesToAges.put("Krishita", 9);

        System.out.println("Number of entries: " +
                namesToAges
                        .entrySet()
                        .stream()
                        .count());

        System.out.println("<<<<<  3. Creating a Stream with Stream.of >>>>>");

        Stream<Integer> sttr1 = Stream.of(9, 6, 7, 6);
        System.out.println(sttr1.count());

        Stream<String> strString = Stream.of("Mayur", "Bhavana");
        System.out.println(strString.count());

    }
}
