package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Point;
import lecture.ch08_OOP.Figure.Shape;
import lecture.ch08_OOP.Figure.impl.Line;

public class LineFactory implements ShapeFactory {
    Point point1;
    Point point2;

    public LineFactory(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public Shape createShape() {
        return new Line(this.point1, this.point2);
    }
}
