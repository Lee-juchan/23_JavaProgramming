package lecture.ch09_EnumAndCollection.Generic.Printable.App;

import lecture.ch08_OOP.Figure.*;
import lecture.ch08_OOP.Figure.impl.*;
import lecture.ch09_EnumAndCollection.Generic.Printable.*;

public class GeneralPrintDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(1,2), new Point(3,4));
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        Square square = new Square(new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8));

        line.setColor("blue");
        triangle.setColor("red");

        GeneralPrinter<Printable> printer = new GeneralPrinter<>();
        printer.set(line);
        printer.print();

        printer.set(triangle);
        printer.print();

        printer.set(square);
        printer.print();
    }
}
