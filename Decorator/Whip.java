package Decorator;

public class Whip extends AnyDecorator{

    public Whip(Napitok napitok){
        this.napitok = napitok;
    }
    @Override
    public String getDescription() {
        return napitok.getDescription() + " Whip";
    }

    @Override
    public double cost() {
        return napitok.cost() + 2;
    }
}
