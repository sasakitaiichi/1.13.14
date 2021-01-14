package stream;

import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersUsingStream {

    private static int count = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Object[] chars = random.ints(100, (int) 'a', (int) 'z' + 1).
                mapToObj(e -> (char) e).toArray();

        System.out.println("The lowercase numbers are:");
        Stream.of(chars).forEach(e -> {
            System.out.println(e + (++count % 20 == 0 ? "\n" : " "));
        });

        System.out.print("\nThe occurrences of each letter are:");

        Stream.of(chars).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> {
            System.out.print(v + ":" + k + " ");
        });
    }
}
