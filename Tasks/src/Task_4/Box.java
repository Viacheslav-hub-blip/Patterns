package Task_4;

import java.util.ArrayList;

public class Box extends Shape {
    private int limit = 7;
    private double x;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double x) {
        super(x);
        this.x = x;
    }

    public boolean add(Shape shape) {
        if (shapes.size() < limit) {
            shapes.add(shape);
            return true;
        } else {
            return false;
        }
    }
}
