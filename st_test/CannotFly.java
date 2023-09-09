package st_test;

public class CannotFly implements FlyInterf{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
