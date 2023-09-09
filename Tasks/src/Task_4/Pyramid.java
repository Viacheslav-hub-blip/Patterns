package Task_4;

public class Pyramid extends Shape{

    public Pyramid(double height, double s){
        super(height * s * 4/3);
        this.height = height;
        this.s = s;
    }
    double s;
    double height;
}
