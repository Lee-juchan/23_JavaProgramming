/*
    모든 도형의 부모가 되는 추상클래스
    1. draw() 추상 메소드
    2. Paintable 인터페이스 상속 -> 모든 도형에 paint() 메소드
*/

package lecture.ch08_OOP.Figure;

import lecture.ch09_EnumAndCollection.Generic.Printable.Printable;

public abstract class Shape implements Paintable, Printable {
    protected String color = "NULL";

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void paint() {
        System.out.printf("(%s) : painted %s\n", this.getClass().getName(), this.color);
    }
    @Override
    public void print() {
        System.out.printf("(%s) : printing... %s\n", this.getClass().getName(), this.color);
    }

    public abstract void draw();
}
