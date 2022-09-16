package academ.findyurov.main;

import academ.findyurov.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Range range1 = new Range(35, 50);
        Range range2 = new Range(20, 30);

        System.out.println("The length of the range from the initial number to the extreme.");
        System.out.print(range1.getLength());           // метод для вычисления длины диапазона

        System.out.println();

        System.out.println("Enter number between first number to last number:");
        double number = scanner.nextDouble();

        System.out.println(range1.isInside(number));    // применение метода isInside

        Range range;

        System.out.println("range intersections");
        range1.print();
        System.out.print("and ");
        range2.print();

        range = Range.getInterval(range1,range2);

        if (range != null) {
            range.print();
        } else{
            System.out.println("no intersections");
        }

        System.out.println();

        System.out.print("Unification range: ");
        range1.print();
        System.out.print("and ");
        range2.print();
        Range[] union = Range.getUnion(range1, range2);
        for (Range element : union) {
            element.print();
            System.out.print(" ");
        }

        System.out.println();

        System.out.print("Range difference: ");
        range1.print();
        System.out.print("and ");
        range2.print();
        System.out.println();
        Range[] diff = Range.getDifference(range1, range2);
        if (diff.length != 0) {
            for (Range elem : diff) {
                elem.print();
                System.out.print(" ");
            }
        }else{
            System.out.println("No difference");
        }
    }
}
