package st_test;

public class Main {
    public static void main(String[] args) {
        BaseDuck baseDuck = new BaseDuck();
        baseDuck.fly();

        baseDuck.setFlypos(new CannotFly());

        baseDuck.fly();
    }
}
