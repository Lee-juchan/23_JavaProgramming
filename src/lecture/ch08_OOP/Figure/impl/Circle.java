package lecture.ch08_OOP.Figure.impl;

import lecture.ch08_OOP.Figure.Point;
import lecture.ch08_OOP.Figure.Shape;

public class Circle extends Shape {
    protected Point center;
    protected Point point;

    public Circle(Point center, Point point) {
        this.center = center;
        this.point = point;
    }

    private double getRadius() { // 두 점 사이의 거리
        return Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    @Override
    public void draw() {
        System.out.printf("(%s) : center : (%d, %d), radius : %.2f\n",
            this.getClass().getName(),
            this.center.getX(), this.center.getY(),
            getRadius());
    }
}
