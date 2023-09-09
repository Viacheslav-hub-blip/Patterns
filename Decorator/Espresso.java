package Decorator;

public class Espresso extends Napitok{

    public Espresso(){
        description = "espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
