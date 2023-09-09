package Task_1_2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            Stream<Integer> delit = isPrise(i);

            if(delit.count() == 0){
                System.out.println(i);
            }
        }
    }

    public static Stream<Integer> isPrise(int x) {
        ArrayList<Integer> arrayPrise = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(x) + 1; i++) {
            if (x % i == 0) {
                arrayPrise.add(i);
                arrayPrise.add(x / i);
            }
        }
        return arrayPrise.stream().distinct().sorted();
    }
}
