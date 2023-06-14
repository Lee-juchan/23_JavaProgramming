package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Shape;

// 구체적인 Factory를 인자로 받고, 해당 shape를 만들어주는 클래스
public class BaseFactory {
    public static Shape getShape(ShapeFactory shapeFactory) {
        return shapeFactory.createShape();
    }
}
