package st_test;

public abstract class Duck {
    FlyInterf flypos;
    QuackInter quackpos;

    public Duck(){

    }
    public void setFlypos(FlyInterf flypos){
        this.flypos = flypos;
    }

    public void setQuackpos(QuackInter quack){
        this.quackpos = quack;
    }

    public void fly(){
        flypos.fly();
    }
    public void quack(){
        quackpos.quack();
    }

}
