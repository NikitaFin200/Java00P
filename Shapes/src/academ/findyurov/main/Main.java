package academ.findyurov.main;

import academ.findyurov.circle.Circle;
import academ.findyurov.rectangle.Rectangle;
import academ.findyurov.shape.Shape;
import academ.findyurov.square.Square;
import academ.findyurov.triangle.Triangle;

import java.util.Arrays;

public class Main {
    private static Shape getShapeWithMaxArea(Shape... shapes) {
        Arrays.sort(shapes, new ShapeComparatorArea());
        return shapes[shapes.length - 1];
    }

    private static Shape getShapeWithSecondPerimeter(Shape... shapes) {
        Arrays.sort(shapes, new ShapeComparatorPerimeter());
        return shapes[shapes.length - 2];
    }

    public static void main(String[] args) {
        Shape figure1 = new Square(2);
        System.out.println("square area = " + figure1.getArea());
        System.out.println("width = " + figure1.getWidth());
        System.out.println("height = " + figure1.getHeight());
        System.out.println("perimeter = " + figure1.getPerimeter());
        System.out.println(figure1.toString());
        System.out.println("hash = " + figure1.hashCode());
        System.out.println();

        Shape figure2 = new Triangle(0, 0, 3, 0, 0, 4);
        System.out.println("triangle area = " + figure2.getArea());
        System.out.println("width = " + figure2.getWidth());
        System.out.println("height = " + figure2.getHeight());
        System.out.println("perimeter = " + figure2.getPerimeter());
        System.out.println(figure2.toString());
        System.out.println("hash = " + figure2.hashCode());
        System.out.println(figure2.equals(figure1));
        System.out.println();

        Shape figure3 = new Rectangle(1, 2);
        System.out.println("rectangle area = " + figure3.getArea());
        System.out.println("width = " + figure3.getWidth());
        System.out.println("height = " + figure3.getHeight());
        System.out.println("perimeter = " + figure3.getPerimeter());
        System.out.println(figure3.toString());
        System.out.println("hash = " + figure3.hashCode());
        System.out.println(figure3.equals(figure2));
        System.out.println();

        Shape figure4 = new Circle(5);
        System.out.println("circle area = " + figure4.getArea());
        System.out.println("width = " + figure4.getWidth());
        System.out.println("height = " + figure4.getHeight());
        System.out.println("perimeter = " + figure4.getPerimeter());
        System.out.println(figure4.toString());
        System.out.println("hash = " + figure4.hashCode());
        System.out.println(figure4.equals(figure3));
        System.out.println();

        Shape figure5 = new Circle(4);
        Shape figure6 = new Triangle(0, 2, 1, 9, 9, 2);
        Shape figure7 = new Rectangle(3, 20);
        Shape figure8 = new Rectangle(1, 9);

        Shape maxShape = getShapeWithMaxArea(figure1, figure2, figure3, figure4, figure5, figure6, figure7, figure8);
        System.out.println("Figure name" + maxShape.getClass());
        System.out.println("The area of the maximum figure = " + maxShape.getArea());
        System.out.println("width = " + maxShape.getWidth());
        System.out.println("height = " + maxShape.getHeight());
        System.out.println("perimeter = " + maxShape.getPerimeter());
        System.out.println();


        Shape secondShape = getShapeWithSecondPerimeter(figure1, figure2, figure3, figure4, figure5, figure6, figure7, figure8);
        System.out.println("Figure name" + secondShape.getClass());
        System.out.println("The area of the second largest figure = " + secondShape.getArea());
        System.out.println("width = " + secondShape.getWidth());
        System.out.println("height = " + secondShape.getHeight());
        System.out.println("perimeter = " + secondShape.getPerimeter());
    }
}
