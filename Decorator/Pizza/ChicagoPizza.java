package Decorator.Pizza;

public class ChicagoPizza extends Pizza{
    public ChicagoPizza(){
        name = "Chicago";
        toppings.add("сыр ...");
    }

    void cut(){
        System.out.println("другая нарезка");
    }
}
