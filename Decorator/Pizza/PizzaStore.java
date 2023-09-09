package Decorator.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.preparate();
        pizza.cut();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
