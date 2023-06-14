package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Point;
import lecture.ch08_OOP.Figure.Shape;
import lecture.ch08_OOP.Figure.impl.Circle;

public class CircleFactory implements ShapeFactory {
    protected Point center;
    protected Point point;

    public CircleFactory(Point center, Point point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public Shape createShape() {
        return new Circle(this.center, this.point);
    }
}
