package Task_5_strings;

import java.util.HashMap;
import java.util.Map;

public class task_1 {

    public static void main(String[] args) {
        Map<Character, Integer> map = buildMap("Hello world");
        System.out.println(map);
    }

    public static Map<Character, Integer> buildMap(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                map.compute(ch, ((character, integer) -> integer == null ? 1 : integer + 1));
            }
        }

        return map;

    }
}
