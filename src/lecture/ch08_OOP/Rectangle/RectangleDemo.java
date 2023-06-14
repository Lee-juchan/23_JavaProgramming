package lecture.ch08_OOP.Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle(10, 20);
        Rectangle r4 = new Rectangle(10l, 20l);

        r1.showLength();
        r2.showLength();
        r3.showLength();
        r4.showLength();
    }
}
