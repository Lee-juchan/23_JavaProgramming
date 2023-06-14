package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Point;
import lecture.ch08_OOP.Figure.Shape;
import lecture.ch08_OOP.Figure.impl.Square;

public class SquareFactory implements ShapeFactory {
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public SquareFactory(Point point1, Point point2, Point point3, Point point31) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point31;
    }

    @Override
    public Shape createShape() {
        return new Square(this.point1, this.point2, this.point3, this.point4);
    }
}
