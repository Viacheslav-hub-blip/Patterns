package Task_5_strings;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class task_5 {
    public static void main(String[] args) {
        String str = "slavaslavaslavasss";
        String t = "slava";

        System.out.println(count(str, t));
    }

    public static Integer count(String text, String str){
        String[] strings = text.split(str, -1);
        return strings.length - 1;
    }

}
