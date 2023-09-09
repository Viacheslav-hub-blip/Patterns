package Task_4;

public class SolidOfRevolution extends Shape{
    double radius;

    public SolidOfRevolution(double radius, double volume){
        super(volume);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
