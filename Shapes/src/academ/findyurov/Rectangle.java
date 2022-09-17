package academ.findyurov;

import java.util.Arrays;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final static int PERIMETER_COEFFICIENT = 2;

    public Rectangle(double side1, double side2) {
        this.width = side1;
        this.height = side2;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle p = (Rectangle) obj;
        return (width == p.width) && (height == p.height);
    }

    @Override
    public String toString() {
        double[] support = {width, height};
        return Arrays.toString(support);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(width);
        hash = prime * hash + Double.hashCode(height);
        return hash;
    }
}
