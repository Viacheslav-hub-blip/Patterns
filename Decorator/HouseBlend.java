package Decorator;

public class HouseBlend extends Napitok{

    public HouseBlend(){
        description = "house";
    }
    @Override
    public double cost() {
        return .89;
    }
}
