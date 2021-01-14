package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] name = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};

        Stream.of(name).limit(4).sorted().forEach(e -> System.out.println(e + " "));

        System.out.println();

        Stream.of(name).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e ->
                System.out.println(e + "  "));

        System.out.println();

        Stream.of(name).skip(4).sorted(String::compareToIgnoreCase).forEach(e ->
                System.out.println(e + "  "));

        System.out.println();

        System.out.println(Stream.of(name).anyMatch(e -> e.equals("Stacy")));

        System.out.println();

        System.out.println(Stream.of(name).allMatch(e -> Character.isUpperCase(e.charAt(0))));

        System.out.println();

        System.out.println(Stream.of(name).noneMatch(e -> e.startsWith("Ko")));

        System.out.println();

        System.out.println(Stream.of(name).map(e -> e.toUpperCase()).distinct().count());

        System.out.println();

        Object[] arr = Stream.of(name).map(String::toLowerCase).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
