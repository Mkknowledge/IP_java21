package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class methodReferences02 {

    public static void main(String[] args) {
        System.out.println("<<<<<  Bound Method Reference  >>>>>");
        String name = "Mayru";
        Supplier<String> lowerMR = name::toLowerCase;
        System.out.println(lowerMR.get());

        Predicate<String> titleMR = name::startsWith;
        System.out.println(titleMR.test("fsd"));

        System.out.println("<<<<<  UnBound Method Reference  >>>>>");

        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("harry"));

        BiFunction<String, String, String> conct = (s1, s2) -> s1.concat(s2);
        System.out.println(conct.apply("Bhawana", " Mayur"));

        System.out.println("<<<<<  Static Method Reference  >>>>>");

        Consumer<List<Integer>> sortMR = Collections::sort;

        List<Integer> unsortList = Arrays.asList(4,9,2,9,1,0,5);
        sortMR.accept(unsortList);
        System.out.println(unsortList);

        System.out.println("<<<<<  Constructor  Method Reference  >>>>>");

        Supplier<StringBuilder> sbMR = StringBuilder::new;
        StringBuilder sb = sbMR.get();
         sb.append("sadsa sadas");
        System.out.println(sb);
    }
}
