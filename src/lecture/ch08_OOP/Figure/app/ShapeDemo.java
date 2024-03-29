package lecture.ch08_OOP.Figure.app;

import lecture.ch08_OOP.Figure.*;
import lecture.ch08_OOP.Figure.impl.*;

public class ShapeDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(1,2), new Point(3,4));
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        Square square = new Square(new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8));
        Circle circle = new Circle(new Point(2,3), new Point(4, -5));

        DrawingList list = new DrawingList();

        line.setColor("blue");
        triangle.setColor("red");
        circle.setColor("pink");

        list.setShape(line, triangle, square, circle);
        list.draw();
        list.paint();
    }
}
