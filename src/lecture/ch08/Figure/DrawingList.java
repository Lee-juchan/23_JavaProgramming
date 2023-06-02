/*
    도형을 일괄적으로 draw(), paint() 해주는 클래스
*/

package lecture.ch08.Figure;

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
}
