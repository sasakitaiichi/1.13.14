package stream;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AnalyzeNumbersUsingStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items");

        int count = input.nextInt();

        double[] array = new double[count];
        System.out.println("Enter number : ");
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        double avg = DoubleStream.of(array).average().getAsDouble();

        System.out.println(avg);

        System.out.println("Numbers above average is " + DoubleStream.of(array).filter(e -> e > avg).count());

    }
}
