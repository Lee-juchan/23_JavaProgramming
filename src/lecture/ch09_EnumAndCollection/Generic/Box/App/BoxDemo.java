package lecture.ch09_EnumAndCollection.Generic.Box.App;

import lecture.ch09_EnumAndCollection.Generic.Box.Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> sBox = new Box<>();
        sBox.set("Test");
        System.out.println(sBox.get());

        // Box<int> iBox = new Box<>(); 참조타입만 가능 (기본타입 x)
        Box<Integer> iBox = new Box<>(); 
        iBox.set(5);
        System.out.println(iBox.get());
    }
}