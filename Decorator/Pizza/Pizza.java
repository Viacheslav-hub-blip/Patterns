package Decorator.Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String douth;
    String sauce;

    List<String> toppings = new ArrayList<>();

    void preparate(){
        System.out.println("готовка " + name);
        System.out.println("добавление соуса");
        for(String topiing : toppings){
            System.out.println("добавлено " + topiing);
        }
    }

    void bake(){
        System.out.println("готовка");
    }

    void cut(){
        System.out.println("нарезка");
    }
}
