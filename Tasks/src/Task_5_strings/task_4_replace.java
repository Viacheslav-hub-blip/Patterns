package Task_5_strings;

import java.util.Arrays;
import java.util.List;

public class task_4_replace {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("блять", "сука");
        String st = "блять сука сука блять";
        System.out.println(validate(st, words));
    }

    public static String validate(String text, List<String> words){
        String valid = text;
        for(String word: words){
            if(valid.contains(word)){
                valid = valid.replace(word, "вырезано");
            }
        }
        return valid;
    }

}
