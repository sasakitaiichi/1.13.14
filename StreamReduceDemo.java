package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduceDemo {
    public static void main(String[] args) {
        int[] value = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};

        System.out.print("The value are ");
        IntStream.of(value).forEach(e -> System.out.println(e + " "));

        System.out.println("\nThe result of multiplying all value is " +
                IntStream.of(value).parallel().reduce(1, (e1, e2) -> e1 * e2));

        System.out.print("The value are " +
                IntStream.of(value).mapToObj(e -> e + " ")
                        .reduce((e1, e2) -> e1 + "," + e2).get());

        String[] name = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};
        System.out.print("\nThe names are : ");
        System.out.print(Stream.of(name).reduce((x, y) -> x + "," + y).get());

        System.out.print("Concat names : ");
        System.out.print(Stream.of(name).
                reduce((x, y) -> x + y).get());

        System.out.print("Total number of characters : ");
        System.out.print(Stream.of(name).reduce((x, y) -> x + y).get().length());
    }
}
