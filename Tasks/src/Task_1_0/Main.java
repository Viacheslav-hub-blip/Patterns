package Task_1_0;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = Math.random();
        }

        OptionalDouble max = Arrays.stream(array).max();
        System.out.println(max);

        double medium = Arrays.stream(array).sum()/array.length;

        System.out.println(medium);

        OptionalDouble min = Arrays.stream(array).min();

        System.out.println(min);

    }
}
