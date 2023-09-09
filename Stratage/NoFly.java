package Stratage;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
