package Stratage;

public class Main {
    public static void main(String[] args) {
        Duck newDuck = new NewDuck();
        newDuck.performFly();
        newDuck.performQuack();
        newDuck.swim();

        System.out.println();

        Duck modelDuck = new modelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new NoFly());
        modelDuck.performFly();
    }
}
