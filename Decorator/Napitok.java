package Decorator;

public abstract class Napitok {
    String description = "empty";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
