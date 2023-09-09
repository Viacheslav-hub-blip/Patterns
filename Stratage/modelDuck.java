package Stratage;

public class modelDuck extends Duck{

    public modelDuck(){
        flyBehavior =  new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("");
    }
}
