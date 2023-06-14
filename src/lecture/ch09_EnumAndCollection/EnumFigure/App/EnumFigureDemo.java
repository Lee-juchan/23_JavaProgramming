package lecture.ch09_EnumAndCollection.EnumFigure.App;

import lecture.ch08_OOP.Figure.*;
import lecture.ch08_OOP.Figure.impl.*;
import lecture.ch09_EnumAndCollection.EnumFigure.Constants.*;
import lecture.ch09_EnumAndCollection.EnumFigure.Factory.*;

public class EnumFigureDemo {

    // Enum값에 따라 다양한 도형 만드는 함수
    public static Shape createShape(ShapeType type, Point ...points) {
        Shape shape = switch(type) {
            case LINE -> new Line(points[0], points[1]);
            case TRIANGLE -> new Triangle(points[0], points[1], points[2]);
            case SQURE -> new Square(points[0], points[1], points[2], points[3]);
            case CIRCLE -> new Circle(points[0], points[1]);
            default -> new Line(points[0], points[1]);
        };

        return shape;
    }

    public static void main(String[] args) {
        DrawingList list = new DrawingList();

        Shape l1 = createShape(ShapeType.LINE, new Point(1,2), new Point(3,4));
        Shape t1 = createShape(ShapeType.TRIANGLE, new Point(1,2), new Point(3,4), new Point(5,6));
        Shape s1 = createShape(ShapeType.TRIANGLE, new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8));
        Shape c1 = createShape(ShapeType.CIRCLE, new Point(1,2), new Point(3,4));

        list.setShape(l1, t1, s1, c1);
        list.draw();
        list.paint();


        // factory method 활용
        Shape l2 = BaseFactory.getShape(new LineFactory(new Point(1,2), new Point(3,4)));
        Shape t2 = BaseFactory.getShape(new TriangleFactory(new Point(1,2), new Point(3,4), new Point(5,6)));
        Shape s2 = BaseFactory.getShape(new SquareFactory(new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8)));
        Shape c2 = BaseFactory.getShape(new CircleFactory(new Point(1,2), new Point(3,4)));
    }
}
