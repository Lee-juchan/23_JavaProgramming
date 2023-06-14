package lecture.ch08_OOP.Figure.impl;

import lecture.ch08_OOP.Figure.*;

public class Square extends Triangle {
    protected Point point4;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3);
        this.point4 = point4;
    }

    @Override
    public void draw() {
        System.out.printf("(%s) : (%d, %d), (%d, %d), (%d, %d), (%d, %d)\n", 
            this.getClass().getName(),
            this.point1.getX(), this.point1.getY(), 
            this.point2.getX(), this.point2.getY(), 
            this.point3.getX(), this.point3.getY(), 
            this.point4.getX(), this.point4.getY());
    }
}
