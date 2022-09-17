package academ.findyurov.main;

import academ.findyurov.shape.Shape;

import java.util.Comparator;

public class ShapeComparatorPerimeter  implements Comparator<Shape> {
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getPerimeter(), shape2.getPerimeter());
    }
}
