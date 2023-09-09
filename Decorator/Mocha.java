package Decorator;

public class Mocha extends AnyDecorator{

    public Mocha(Napitok napitok){
        this.napitok = napitok;
    }
    @Override
    public String getDescription() {
        return napitok.description + " Mocha";
    }

    @Override
    public double cost() {
        return napitok.cost() + .2;
    }
}
