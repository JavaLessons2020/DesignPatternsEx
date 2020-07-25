package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    static List<Shape> shapes;

    public static void main(String[] args) {
        GrerenTriangle grerenTriangle = new GrerenTriangle();
        Rectangle rectangle = new Rectangle();
        shapes = new ArrayList<>();
        shapes.add(grerenTriangle);
        shapes.add(rectangle);
    }

}
