package Stratage;

public class NoQuack  implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("cant quack");
    }
}
