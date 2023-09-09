package st_test;

public class CannotQuack implements QuackInter{
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
