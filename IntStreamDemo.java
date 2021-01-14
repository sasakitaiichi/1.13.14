package stream;


import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args) {
        int[] value = {3, 4, 1, 5, 28, 1, 3, 3, 4, 6};

        System.out.println(IntStream.of(value).distinct().filter(e -> e > 3 && e % 2 == 0).average().getAsDouble());

        System.out.println("The sum of the first4 numbers is " + IntStream.of(value).limit(4).sum());

        IntSummaryStatistics stats = IntStream.of(value).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());

        String[] name = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "john"};

        System.out.println(Stream.of(name).mapToInt(e -> e.length()).sum());

        System.out.println("The number of digits is array value is  " +
                Stream.of(value).map(e -> e + "")
                        .mapToInt(e -> e.length()).sum());
    }
}
