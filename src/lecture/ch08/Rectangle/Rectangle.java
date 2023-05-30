/*
    @brief : 생성자 오버로딩
    @details : 다양한 변 길이의 Rectanle 구현 (정사각형, 직사각형 등)
*/

package lecture.ch08.Rectangle;

public class Rectangle {
    private int width;
    private int height;

    // constructors
    public Rectangle() {
        this(0, 0);    // this로 다른 생성자를 부르려면, 생성자 함수내의 첫줄이여야 함
        // this.width = 0;          // 생성자 호출전에 값이 바뀐다면, 상태를 예측할 수 없게 됨
        // this.height = 0;
    }
    public Rectangle(int length) {
        this(length, length);
        // this.width = length;
        // this.height = length;
    }
    public Rectangle(long width, long height) {
        this((int)width, (int)height);
        System.out.println("Long type");
        // this.width = (int) width;
        // this.height = (int) height;
    }
    public Rectangle(int width, int height) {
        System.out.println("Int type");
        this.width = width;
        this.height = height;
    }

    public void showLength() {
        System.out.printf("Width : %d, Height : %d\n", this.width, this.height);
    }

    public int getArea() {
        return this.width * this.height;
    }
}
