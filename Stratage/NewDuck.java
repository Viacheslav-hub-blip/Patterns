package Stratage;

public class NewDuck extends Duck{
    public NewDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("display new duck");
    }
}
