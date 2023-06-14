/*
    도형을 일괄적으로 draw(), paint() 해주는 클래스
*/

package lecture.ch08_OOP.Figure;

import lecture.ch09_EnumAndCollection.Generic.Printable.Printable;

public class DrawingList {
    private Shape[] shapeList = null;

    public void setShape(Shape ...shapes) {
        this.shapeList = shapes;
    }

    public void draw() {
        for(Shape s : shapeList) {
            s.draw();
        }
    }
    public void paint() {
        for (Paintable p : shapeList) {
            p.paint();
        }
    }
    public void print() {
        for (Printable p : shapeList) {
            p.print();
        }
    }
}
