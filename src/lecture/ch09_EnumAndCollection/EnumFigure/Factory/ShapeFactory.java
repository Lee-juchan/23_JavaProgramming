package lecture.ch09_EnumAndCollection.EnumFigure.Factory;

import lecture.ch08_OOP.Figure.Shape;

// 팩토리 형태 정의
public interface ShapeFactory {
    Shape createShape();
}