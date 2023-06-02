package lecture.ch08.Figure.app;

import lecture.ch08.Figure.*;
import lecture.ch08.Figure.impl.*;

public class ShapeDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(1,2), new Point(3,4));
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
        Square square = new Square(new Point(1, 2), new Point(3, 4), new Point(5, 6), new Point(7, 8));

        DrawingList list = new DrawingList();

        line.setColor("blue");
        triangle.setColor("red");

        list.setShape(line, triangle, square);
        list.draw();
        list.paint();
    }
}
