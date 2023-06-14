package lecture.ch08_OOP.Figure.impl;

import lecture.ch08_OOP.Figure.*;

public class Triangle extends Line {
    protected Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        super(point1, point2);
        this.point3 = point3;
    }

    @Override
    public void draw() {
        System.out.printf("(%s) : (%d, %d), (%d, %d), (%d, %d)\n",
            this.getClass().getName(),
            this.point1.getX(), this.point1.getY(),
            this.point2.getX(), this.point2.getY(),
            this.point3.getX(), this.point3.getY());
    }
}
