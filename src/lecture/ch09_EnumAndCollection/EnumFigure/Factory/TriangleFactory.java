package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Point;
import lecture.ch08_OOP.Figure.Shape;
import lecture.ch08_OOP.Figure.impl.Triangle;

public class TriangleFactory implements ShapeFactory {
    Point point1;
    Point point2;
    Point point3;

    public TriangleFactory(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public Shape createShape() {
        return new Triangle(this.point1, this.point2, this.point3);
    }
}
