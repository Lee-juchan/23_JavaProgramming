package lecture.ch08.Figure.impl;

import lecture.ch08.Figure.*;

public class Line extends Shape {
    protected Point point1;
    protected Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void draw() {
        System.out.printf("(%s) : (%d, %d), (%d, %d)\n",
            this.getClass().getName(),
            this.point1.getX(), this.point1.getY(),
            this.point2.getX(), this.point2.getY());
    }
}
