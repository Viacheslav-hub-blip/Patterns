package Task_4;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double height, double radius){
        super(radius, Math.PI * radius * radius * height);
        this.height = height;
    }

}
