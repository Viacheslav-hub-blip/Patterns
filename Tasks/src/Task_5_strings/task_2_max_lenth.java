package Task_5_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task_2_max_lenth {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("slava", "pasha", "vvv");
        System.out.println(getMaxString(strings));
    }

    public static String getMaxString(List<String> strings){
        strings = strings.stream().sorted((o1, o2) -> o2.length() - o1.length()).collect(Collectors.toList());
        return strings.get(0);
    }
}
